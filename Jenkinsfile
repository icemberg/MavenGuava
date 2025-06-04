pipeline {
	agent any
	tools {
		maven 'Maven'
	}
	stages {
		stage('Checkout') {	
			steps {
				git branch: 'main', url: 'https://github.com/icemberg/MavenGuava.git'
			}
		}
		stage('Build') {
			steps {
				sh 'mvn clean package'
			}
		}
		stage('Test') {
			steps {
				sh 'mvn test'
			}
		}
		stage('Run Application') {
			steps {
				sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
			}
		}
	}
	post {
		success {
			echo "Deployment Successful"
		}
		failure {
			echo "Deployement Failed!!"
		}
	}
}
