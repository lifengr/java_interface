package com.github.db

import org.junit.Assert
import spock.lang.Specification

class Case extends Specification {
    DataRepository dataRepository
    void setup(){
        dataRepository =new DataRepository()
    }
//    def "should get user info successfully"(){
//        given:"no given"
//        when:"query user table to get info"
//        def userInfo=dataRepository.getUserInfo()
//        then:"should get user info"
//        userInfo.each {it->println it.mobile_number+":"+it.name+":"+it.create_date}
//    }
//    def "should get enterprise info successfully"(){
//        given:"no given"
//        when:"query enterprise table to get info"
//        def staffInfo=dataRepository.getStaffInfo(userName)
//        then:"should get enterprise info"
//        Assert.assertEquals(staffInfo.mobile_number,mobile_number)
//        where:
//        userName|mobile_number
//        "李凤"|"+8613800000000"
//        "何艾"|"+8613551849200"
//        "司空"|"+8619983142038"
//    }
}
