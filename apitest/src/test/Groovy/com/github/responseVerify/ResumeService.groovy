package com.github.responseVerify

import groovy.json.JsonSlurper

class ResumeService {
    JsonSlurper jsonSlurper

    ResumeService() {
        jsonSlurper = new JsonSlurper()
    }

    def getPersonByCountry(String res, country) {
        def resumeDetails = jsonSlurper.parseText(res)          //将String类型的json字符串转换为数据对象，转换为数据对象后才能轻松获取对应的属性值
        resumeDetails.birthPlace.country == country ? resumeDetails.name : "no person"
        //获取接口response body中的contry信息，如果与传入的country一致则返回该值，否则返回“no person”
    }

    def getContactPhone(String res) {
        def resumDetails = jsonSlurper.parseText(res)
        resumDetails.contacts.size() > 0 ? resumDetails.contacts[0].phone : "no contact"
    }
    void printIfpersonWithSpecialSkill(String res,language){
        def resumeDetails=jsonSlurper.parseText(res)
        if(resumeDetails.skills.tech.size()>0){
            def programmingSkill=resumeDetails.skills.tech.find{it->it.language==language}
            println"--programmingSkill:${programmingSkill.language}--level:${programmingSkill.level}"
        }
    }
    void printWorkingDetails(String res){
        def resumeDetails=jsonSlurper.parseText(res)
        if (resumeDetails.working.workingProject.size()>0){
            resumeDetails.working.workingProject.each{it->
                println"--projectName:${it.projectName}--jobTitle:${it.jobTitle}--responseibility:${it.responsibility}"
            }
        }
    }
}