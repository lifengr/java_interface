package com.github.foureCourse
import spock.lang.Specification

import static io.restassured.RestAssured.given

class ThirdDemo extends Specification {
    def "should call get user by name and by price api successfully"(){
        given:"no given"
        when:"call mock api api"
        given().baseUri("http://localhost:9090").log().all()
                .queryParam("name","sanguo")//设置接口的查询参数
                .queryParam("price",18)//设置接口的查询参数
                .when()
                .get("api/getBookByPathPatter/test")
                .then().log().all()
                .assertThat().statusCode(200)
        then:"no then"
    }
}
