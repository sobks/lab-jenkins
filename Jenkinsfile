pipeline {
    agent any
    stages {
        stage('git checkout') {
            steps {
                script {
                    def gitRepoURL = 'https://github.com/sobks/lab-jenkins.git'
                    def gitCredentials = '39b671d7-31be-40dd-af7c-bbffd5d53e52'
                
                    checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: gitRepoURL, credentialsId: gitCredentials]]])
                }
            }
        }
        
        stage('Build the application'){
            steps{
                sh 'mvn clean install'
            }
        }
        
        stage('Unit Test Execution'){
            steps{
                sh 'mvn test'
            }
        }
        
        stage('Build the docker image'){
            steps{
                sh 'docker build -t java-app .'
            }
        }
        
        stage('Publier vers Dockerhub') {
            steps {
                script {
                    withCredentials([string(credentialsId: '6fba7c28-37ca-41af-911e-c223ffbbbf9a', variable: 'dockerHubPass')]) {
                        sh "docker login -u s0bks -p $dockerHubPass"
                    }

                    sh "docker push s0bks/devops-repo"
                }
            }
        }
    }
}
