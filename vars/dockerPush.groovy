#!/usr/bin/env groovy

def call (){
    /*not the final code*/
    script
        {
          withCredentials([usernamePassword(credentialsId: env.registryCredential, passwordVariable: 'Password', usernameVariable: 'Username')]) 
          {
          sh "docker login -u=\"${Username}\" -p=\"${Password}\""      
          sh "docker push ${env.buildTAG}"
          sh "docker push ${env.buildLATESTTAG}"
          }
     }
}
