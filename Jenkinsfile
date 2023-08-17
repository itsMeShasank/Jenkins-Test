pipeline {
    agent any

    environment {
        TOMCAT_CREDENTIALS = credentials('TOMCAT_CREDENTIALS')
    }

    stages {
        stage('Build') {
            steps {
                bat "mvn clean verify"
                bat "mvn jacoco:prepare-agent"
            }
        }
        stage('SonarQube') {
            steps {
                bat "mvn sonar:sonar -Dsonar.projectKey=SpringBoot-Pipeline-Application -Dsonar.projectName='SpringBoot-Pipeline-Application' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_3b39ad19235983b87322ff22e7600956573e54d4 -Dsonar.java.coveragePlugin=jacoco"
            }
            post{
                success{
                    archiveArtifacts artifacts:'**/target/*.war'
                }
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'TOMCAT_CREDENTIALS', path: '', url: 'http://localhost:6060')], contextPath: 'first', war: '**/*.war'
            }
        }
        }
    }