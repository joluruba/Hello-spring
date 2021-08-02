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
                junit skipPublishingChecks: true, testResults: '/var/lib/jenkins/workspace/hello-spring-jenkinsfile/build/test-results/test/TEST-com.example.hellospring.HelloSpringApplicationTests.xml
'

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