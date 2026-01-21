def call(String JOB_NAME){
    return [
            projectName : 'react-app',
            jobName : JOB_NAME.tokenize('/')[1],
            branch : "main",


            //customWorkspace : "workspace/" + JOB_NAME + "/",
            gitAdressAndName : JOB_NAME.tokenize('/')[1]
    ]

}

