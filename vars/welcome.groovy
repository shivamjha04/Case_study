def call(){
    try{
    echo "Hello World"
    emailext attachLog: true, body: 'Hi,', subject: 'Jenkins report', to: 'shivamjha04@gmail.com'
    }
    catch(err){
        emailext body: "${err}", subject:'Jenkins file', to:'shivamjha04@gmail.com'
     
}
