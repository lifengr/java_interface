package com.github.responseVerify

import spock.lang.Specification

class Case extends Specification {
    ResumeClient resumeClient
    ResumeService resumeService

    def setup() {
        resumeClient = new ResumeClient()
        resumeService = new ResumeService()
    }

    def "get person from different country"() {
        given: "no given"
        when: "call the get resume api"
        def res = resumeClient.getResumeDetails()
        then: "println  out the person name from different country"
        println resumeService.getPersonByCountry(res, country)
        where:
        country | placeHolder
        "China" | ""
        "USA" | ""
    }
    def "get first phone from contacts "(){
        given:"no given"
        when:"call the get resume api"
        def res=resumeClient.getResumeDetails()
        then:"println out the phone from contacts"
        println resumeService.getContactPhone(res)
    }
    def"get language from skill"(){
        given:"no given"
        when:"call the get resume api"
        def res=resumeClient.getResumeDetails()
        then:"println out the language from skill"
        println resumeService.printIfpersonWithSpecialSkill(res,language)
        where:
        language|placeHolder
        "Java"|""
        "C++"|""
    }
    def "get workingProject from working"(){
        given:"no given"
        when:"call the get resume api"
        def res=resumeClient.getResumeDetails()
        then:"println out the working project from working"
        println resumeService.printWorkingDetails(res)
    }
    def"get name equal Tome"(){
        given:"no given"
        when:"call the get resume api"
        def res=resumeClient.getResumeDetails2()
        then:"yes or no"
        println resumeClient.getResumeDetails2()
    }
    def"get name is contacts.phone"(){
        given:"no given"
        when:"call the get resume api"
        def res=resumeClient.getResumeDetails3()
        then:"yes or no"
        println resumeClient.getResumeDetails3()
    }
    def"get name header"(){
        given:"no given"
        when:"call the get resume api"
        def res=resumeClient.getResumeDetailHeader()
        then:"yes or no"
        println resumeClient.getResumeDetailHeader()
    }
//    def "call the api"() {
//        given: "no given"
//        when: "call the get resume api"
//        resumeClient.getResumeSchemaValidate(filePath)
//        then: "no then"
//        where:
//        filePath|placeHolder
//        "com/github/data/getResumeSchema.json"|""
//    }
}