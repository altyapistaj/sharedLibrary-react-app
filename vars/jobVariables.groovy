def call(String JOB_NAME){
    return [
            projectName : 'react-app',
            jobName : JOB_NAME.tokenize('/')[1],
            branch : "main",


            gitAdressAndName : JOB_NAME.tokenize('/')[1]
    ]

}

