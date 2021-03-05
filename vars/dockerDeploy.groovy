#!/usr/bin/env groovy

def call (){
    /*not the final code*/
    sh 'scp -i ${env.PemFile} deploy.sh ${env.REMOTE_USER}@${env.REMOTE_HOST}:~/'
    sh 'ssh -i ${env.PemFile} ${env.REMOTE_USER}@${env.REMOTE_HOST} "chmod +x deploy.sh"'
    sh 'ssh -i ${env.PemFile} ${env.REMOTE_USER}@${env.REMOTE_HOST} ./deploy.ssh'
}