package test

import groovy.util.logging.Slf4j
import spock.lang.Specification
import vars.MyParameters

@Slf4j
class MyParametersTest extends Specification {

    def "test generateDynamicChoices method"() {
        given:
        def myParams = new MyParameters()

        when:
        def result = myParams.generateDynamicChoices()

        then:
        result.name == 'CHOICES'
        result.choices == '["option1","option2","option3"]'
        result.description == 'Select an option'
    }
}