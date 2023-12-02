package vars

import groovy.json.JsonOutput

def generateDynamicChoices() {
    return [
            name: 'CHOICES',
            choices: JsonOutput.toJson(['option1', 'option2', 'option3']),
            description: 'Select an option'
    ]
}

return this