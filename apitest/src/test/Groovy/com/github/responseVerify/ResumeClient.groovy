package com.github.responseVerify
import static io.restassured.RestAssured.given
import static org.hamcrest.Matchers.equalTo
//import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath

class ResumeClient {
    def getResumeDetails(){
        def res = given().baseUri("http://localhost:9090")
                .when()
                .get("/api/getResume")
                .then().assertThat().statusCode(200)
                .extract().response().getBody().asString()       //获取接口的response body
        res
    }
    void getResumeDetails2(){
        given().baseUri("http://localhost:9090")
                .when()
                .get("/api/getResume")
                .then().assertThat().statusCode(200)
                .body("name",equalTo("TOM"))
    }
    def getResumeDetails3(){
        given().baseUri("http://localhost:9090")
                .when()
                .get("/api/getResume")
                .then().assertThat().statusCode(200)
                .extract()
                .response().path("contacts.phone")
    }
    def getResumeDetailHeader(){
        given().baseUri("http://localhost:9090")
                .when()
                .get("/api/getResume")
                .then().assertThat().statusCode(200)
                .extract()
                .response().getHeader("content-type")
    }
//    def getResumeSchemaValidate(filePath) {
//        given().baseUri("http://localhost:9090")
//                .when()
//                .get("/api/getResume")
//                .then().assertThat()
//                .body(matchesJsonSchemaInClasspath((String)filePath))
//    }
}