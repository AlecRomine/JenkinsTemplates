#!/usr/bin/env groovy

def call (String servername){
    /*not the final code*/
        def tname = ""
        tname = env.JOB_NAME.replaceAll('/','-')
        env.jobname = tname
        env.DEPLOYSERVER= servername
        env.LATESTTAG= "jenkins-${tname}-latest"
        env.registry = 'jgedney/elrr-images';
        env.buildTAG = "${registry}:${BUILD_TAG}"
        env.buildLATESTTAG = "${registry}:${LATESTTAG}"
        switch(servername) 
        { 
            case "ELRRStorage":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.44.154';
                env.registryCredential = 'Dockerhubjg';
                break;
            case "METADATA":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.45.79';
                env.registryCredential = 'Dockerhubjg';
                break;
            case "ELRRTEST":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.39.130';
                env.registryCredential = 'Dockerhubjg';
                break;
            case "ELRRAUTH":
                env.PemFile = '/home/ubuntu/Private-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.36.63';
                env.registryCredential = 'Dockerhubjg';
                break;
            case "xAPI_PORTAL":
                env.PemFile = '/home/ubuntu/Public-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.2.153';
                env.registryCredential = 'Dockerhubjg';
                break;
            case "ELRR_PORTAL":
                env.PemFile = '/home/ubuntu/Public-Sub-Key.pem';
                env.REMOTE_USER='ubuntu';
                env.REMOTE_HOST='172.31.14.62';
                env.registryCredential = 'Dockerhubjg';
                break;
            default:
                echo "!!!!!!!!!!!!!!!!!!!!UNDEFINED SERVER ${servername} -- WILL CAUSE AN ERROR!!!!!!!!!!!!";
                break;
        } 
    }