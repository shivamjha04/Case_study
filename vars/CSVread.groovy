def call(){
   
      def inputCSVPath = input message: 'Upload file', parameters: [file(name: 'Test.csv', description: 'Upload only CSV file')]            
      def csvContent = readFile "${inputCSVPath}"
                        
      echo "CSV FILE PATH IS : ${inputCSVPath}"
      echo "CSV CONTENT IS: ${csvContent}"
      echo "Sending Email"
      emailext attachLog: true, body: 'Hi,', subject: 'Jenkins report Successful', to: 'shivamjha04@gmail.com'
}
