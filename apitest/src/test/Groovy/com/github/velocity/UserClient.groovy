package com.github.velocity

import static io.restassured.RestAssured.given

class UserClient {
    def addUserWithFile(File file) {
        def res = given().baseUri("http://localhost:9090").log().all()
                .when()
                .body(file)                                    //body参数中传入File对象
                .post("/api/addUserDetails")
                .then().log().all().assertThat().statusCode(200)
                .extract().response().getBody().asString()     //获取接口的response body
        res
    }
    def addUserWithString(String body) {
        def res = given().baseUri("http://localhost:9090").log().all()
                .when()
                .body(body)                                  //body参数中传入接口的request body字符串
                .post("/api/addUserDetails")
                .then().log().all().assertThat().statusCode(200)
                .extract().response().getBody().asString()  //获取接口的response body
        res
    }
}
