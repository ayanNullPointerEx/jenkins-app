@Library('shared-pipeline-library')_
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                cleanWs()
                checkout scm
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
            sayHello 'Ayan'
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
