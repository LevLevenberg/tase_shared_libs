def getTag = {
    if("${env.JOB_BASE_NAME}" == 'dev'){
        return "latest"
    }else{
        return "$commit_id"
    }
}