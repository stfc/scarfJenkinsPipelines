#!groovy

node {
        parallel 'eleven':{
            node {
                stage('11'){
                    build 'HPCG/hpcgRuns/hpcg11Run'
                }
            }
        }, 'twelve':{
            node {
                stage('12') {
                    build 'HPCG/hpcgRuns/hpcg12Run'
                }
            }
        }, 'thirteen':{
            node {
                stage('13') {
                    build 'HPCG/hpcgRuns/hpcg11Run'
                }
            }
        }, 'fourteen':{
            node {
                stage('14'){
                    build 'HPCG/hpcgRuns/hpcg11Run'
                }
            }
        }, 'fifteen':{
            node {
                stage('15'){
                    build 'HPCG/hpcgRuns/hpcg11Run'
                }
            }
        }, 'sixteen':{
            node {
                stage('16'){
                    build 'HPCG/hpcgRuns/hpcg11Run'
                }
            }
        }
}