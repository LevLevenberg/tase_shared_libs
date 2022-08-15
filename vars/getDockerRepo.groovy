def getDockerRepo() {
     switch("${env.JOB_BASE_NAME}"){
        case 'dev':
              return "levlevenberg/dev-demo"
        case 'staging':
                return "levlevenberg/stage-demo"
        case 'master':
                return "levlevenberg/prod-demo"
    }   
}