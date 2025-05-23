def call() {
	stage('checkout'){
		checkout scm
	}
	stage('build') {
		echo 'building'
		sh 'mvn clean install'
	}
	stage('test') {
		echo 'testing'
		sh 'mvn test'
	}
}
