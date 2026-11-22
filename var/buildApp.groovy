
def call() {
    stage('Build') {
        echo 'Building application'

        sh 'mvn -B -Djdk.version=1.8 -DskipTests test org.apache.maven.plugins:maven-war-plugin:3.4.0:war'
    }
}
