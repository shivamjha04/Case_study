def call(){
      
          echo "Sending Mail"
         emailext attachLog: true, body: 'Hi,', subject: 'Jenkins report Failed', to: 'shivamjha04@gmail.com'
  
}
