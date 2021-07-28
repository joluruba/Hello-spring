pipeline {
    agent any
    options {
        ansiColor('xterm')
    }

    stages {
        stage('Build') {
            steps {
                echo 'construyendo gradle'
                withGradle {
                    sh './gradlew assemble'
                }

            }
            post {
                success {
                    echo 'Archivando por proceso correcto'
                    archiveArtifacts artifacts: 'build/libs/*.jar'
                }
            }

        }


           stage('Deploy') {
            steps {
                sh 'docker run --rm hellopring:latest java -jar /tmp/Hello-spring-0.0.1-SNAPSHOT.jar'
            }

        }
    }

}