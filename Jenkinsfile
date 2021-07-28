pipeline {
    agent any
    options {
        ansiColor('xterm')
    }

    stages {
        stage('Build') {
            steps {
                echo 'construyendo gradle con docker-compose'
                sh 'docker-compose build'

            }

        }


           stage('Deploy') {
            steps {
                echo 'echo desplegando ejecucion'
                sh 'docker-compose up -d'
            }

        }
    }

}