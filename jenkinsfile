pipeline {
    agent any

    tools {
        maven "local_maven"
        java "local_java"
    }

    stages {
        stage('Build') {
            steps {
                echo "start"
            }

            stage('SonarQube Analysis') {
                steps {
                    withSonarQubeEnv('local_sonar') {
                        bat '''mvn clean verify sonar:sonar -Dsonar.projectKey=learnJenkins -Dsonar.projectName='learnJenkins' -Dsonar.host.url=http://172.18.0.2:9000''' //port 9000 is default for sonar
                        echo 'SonarQube Analysis Completed'
                    }
                }
            }

            post {
                success {
                    echo "done with success"
                }
            }
        }
    }
}
