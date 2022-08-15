def getTag = {
    if("${env.JOB_BASE_NAME}" == 'dev'){
        return "latest"
    }else{
        def tag=$(git rev-parse --short HEAD | xargs)
        return "$tag"
    }
}