node 
{
  stage("Git clone")
  {
    git branch : "main", url : "https://github.com/AjayPulapa/spring-jenkins-docker-poc.git"
  }
//   stage ("Maven clean&install")
//   {
//     sh "mvn clean"
//     sh "mvn install"
//   }
  stage ("Docker Build")
  {
   sh "docker build -t crud-demo ."
   sh "docker images"
  }
  stage ("Docker Run")
  {
   sh "docker run -d -p 8787:8080 --name demo-container crud-demo" 
   sh "docker ps"
  }
}
