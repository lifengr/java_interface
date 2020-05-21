package com.github.velocity

import com.github.file.FileService
import org.junit.Assert
import spock.lang.Specification

class Case extends Specification {
    FileService fileService
    UserClient userClient
    def setup(){
        fileService=new FileService()
        userClient=new UserClient()
    }
    def "should add user successfully"(){
        given:"no given"
        when:"call the add user api"
        def file=fileService.createFile("./src/test/resources/com/github/data/addUser.json")
        then:"get the correct response"
        Assert.assertEquals(userClient.addUserWithFile(file),"add user successfully")
    }

}
