node {
        parallel 'eleven':{
            node {
                stage('11'){
                    build 'hpcg11Run'
                }
            }
        }, 'twelve':{
            node {
                stage('12') {
                    build 'hpcg12Run'
                }
            }
        }, 'thirteen':{
            node {
                stage('13') {
                    build 'hpcg13Run'
                }
            }
        }, 'fourteen':{
            node {
                stage('14'){
                    build 'hpcg14Run'
                }
            }
        }, 'fifteen':{
            node {
                stage('15'){
                    build 'hpcg15Run'
                }
            }
        }, 'sixteen':{
            node {
                stage('16'){
                    build 'hpcg16Run'
                }
            }
        }
}