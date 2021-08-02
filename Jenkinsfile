pipeline {
    agent any
    options {
        ansiColor('xterm')
    }

    stages {
        stage('test') {
            steps {
                echo 'construyendo con gradle Test para general el fichero xml con el resultado'
                sh './gradlew clean'
                sh './gradlew test'
                junit skipPublishingChecks: true, testResults: 'build/test-results/test/TEST-*.xml'

            }

        }


           stage('Deploy') {
            steps {
                echo 'echo desplegando ejecucion que no haremos porque solo queremos test'

            }

        }
    }

}