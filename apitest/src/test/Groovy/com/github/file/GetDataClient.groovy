package com.github.file

import org.junit.Test

import static io.restassured.RestAssured.config
import static io.restassured.RestAssured.given

class GetDataClient {
    ConfigParser configParser
    TestDataService testDataService
    def configs
    def users

    GetDataClient() {
        configParser = new ConfigParser()
        testDataService=new TestDataService()
        configs = configParser.getGlobalConfig()//获取yaml文件配置信息
        users=testDataService.getUserDataByRole("ForGetDataApi")
    }

    void getData() {
        def res = given().baseUri((String) configs.mockServerUrl)     //调用接口时，接口的baseUri来自yaml文件
                .auth().preemptive().basic("apiUsername", "apiPassword")
                .when()
                .get("/api/getData")
                .then().assertThat().statusCode(200)
                .extract().response().getBody().asString()
        println res
    }
    void getDataWithCsvUser(){
        def res=given().baseUri((String)configs.mockServerUrl)
                .auth().preemptive().basic(user.username,user.password)
                .when()
                .get("/api/getData")
                .then().assertThat().statusCode(200)
                .extract().response().getBody().asString()
        println res
    }
    void getDataWithEncryptPassword(){
        def res=given().baseUri((String)configs.mockServerUrl)
                .auth().preemptive().basic(user.username,testDataService.getPasswordByUserName(users.username))
                .when()
                .get("/api/getData")
                .then().assertThat().statusCode(200)
                .extract().response().getBody().asString()
        println res
    }
    @Test()
    //使用junit的@Test注解调用上面编写的getData方法
    void callGetData() {
//        getData()
//        getDataWithCsvUser()
//        getDataWithEncryptPassword()
    }
}
