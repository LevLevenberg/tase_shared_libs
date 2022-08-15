def getLastCommitMessage = {
    return sh(returnStdout: true, script: 'git log -1 --pretty=%B').trim()
}