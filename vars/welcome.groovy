def call(){
    
    echo "Hello World"
    emailext attachLog: true, body: 'Hi,', subject: 'Jenkins report Successful', to: 'shivamjha04@gmail.com'
      
}
