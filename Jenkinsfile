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
