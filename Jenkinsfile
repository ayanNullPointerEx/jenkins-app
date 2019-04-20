pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                cleanWs()
                sh 'make'
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
