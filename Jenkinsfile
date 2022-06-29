pipeline {
    agent any
        stages {
            stage ('Initialize') {
                steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "MAVEN_HOME = ${MAVEN_HOME}"
                        echo "JAVA_HOME = ${JAVA_HOME}"
                        echo "ALLURE_HOME = ${ALLURE_HOME}"
                    '''
                }
            }
            stage('Compile Stage') {
                 steps{
                     sh 'mvn clean compile'
                 }
            }
            stage('Test Stage') {
                  steps{
                      sh 'mvn test -DsuiteXmlFile="testng.xml"'
                  }
            }
            stage('Report') {
                        steps {
                            publishHTML([reportName  : 'Allure Report', reportDir: 'target/site/allure-maven-plugin', reportFiles: 'index.html',
                                         reportTitles: '', allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false])
                        }
                    }
        }
        post {
            always {
                deleteDir()
            }
            failure {
                slackSend message: "${env.JOB_NAME} - #${env.BUILD_NUMBER} failed (<${env.BUILD_URL}|Open>)",
                        color: 'danger', teamDomain: 'qameta', channel: 'allure', tokenCredentialId: 'allure-channel'
            }
        }
}