def call(String appName){
                sh "docker compose up -d --build ${appName}"
           
}