node {
        parallel 'eleven':{
            node {
                stage('11'){
                    build 'HPL/hplBuildJobs/hpl11'
                }
            }
        }, 'twelve':{
            node {
                stage('12') {
                    build 'HPL/hplBuildJobs/hpl12'
                }
            }
        }, 'thirteen':{
            node {
                stage('13') {
                    build 'HPL/hplBuildJobs/hpl13'
                }
            }
        }, 'fourteen':{
            node {
                stage('14'){
                    build 'HPL/hplBuildJobs/hpl14'
                }
            }
        }, 'fifteen':{
            node {
                stage('15'){
                    build 'HPL/hplBuildJobs/hpl15'
                }
            }
        }, 'sixteen':{
            node {
                stage('16'){
                    build 'HPL/hplBuildJobs/hpl16'
                }
            }
        }
}