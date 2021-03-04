#!/usr/bin/env groovy

def call (String servername){
    /*not the final code*/
        def tname = ""
        tname = env.JOB_NAME.replaceAll('/','-')
        env.jobname = tname
        env.LATESTTAG= "jenkins-${tname}-latest"
        env.registry = 'jgedney/elrr-images';
        env.registryCredential = 'dockerhub';
        switch(servername) 
        { 
            case "ELRRStorage":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.44.154'
                break;
            case "METADATA":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.45.79'
                break;
            case "ELRRTEST":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.39.130'
                break;
            case "ELRRAUTH":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.36.63'
                break;
            case "xAPI_PORTAL":
                env.PemFile = '/home/ubuntu/Public-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.2.153'
                break;
            case "ELRR_PORTAL":
                env.PemFile = '/home/ubuntu/Public-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.14.62'
                break;
            default:
                echo "!!!!!!!!!!!!!!!!!!!!UNDEFINED SERVER ${servername} -- WILL CAUSE AN ERROR!!!!!!!!!!!!"
                break;
        } 
    }