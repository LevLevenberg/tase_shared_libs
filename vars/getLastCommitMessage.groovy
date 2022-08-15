def getLastCommitMessage = {
    def message = sh(returnStdout: true, script: 'git log -1 --pretty=%B').trim()
    return "$message"
}