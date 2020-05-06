pipeline{
    agent any
    stages{
        stage('GitCheckOut'){
            steps{
                checkout([$class: 'GitSCM',
                branches: [[name: '*/master']],
                doGenerateSubmoduleConfigurations: false,
                extensions: [],
                submoduleCfg: [],
                userRemoteConfigs:
                [[url: 'https://github.com/CalebFox96/SoftTest.git']]])
            }
        }
        stage('UnitTest'){
            tools{
                maven 'Maven_3.5.3'
            }
            steps{
                    junit 'target/surefire-reports/*.xml'
            }
        }
        stage('Jacoco') {
             steps {
                sh './jenkins_build.sh'
                junit '*/build/test-results/*.xml'
                step( [ $class: 'JacocoPublisher' ] )
             }
        }
     }
 }

