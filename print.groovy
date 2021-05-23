def call(){
                    def inputCSVPath = 
                    def csvContent = readFile "${inputCSVPath}"
                    
                   sh "echo CSV file path is : ${inputCSVPath}"
                   sh "echo CSV content is: ${csvContent}"
}
