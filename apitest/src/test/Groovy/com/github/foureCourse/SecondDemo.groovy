package com.github.foureCourse

import spock.lang.Specification;
import static io.restassured.RestAssured.given
import static io.restassured.RestAssured.when;
class SecondDemo extends Specification {
    def "should get user details by user name successfully"(){
        given:"no given"
        when:"call mock api api"
        given().baseUri("http://localhost:9090").log().all()//打印request
                .when()
                .pathParam("bookname",bookname)
                .get("api/getBook/{bookname}")
                .then().log().all()//打印response
                .assertThat().statusCode(200)
        then:"no then"
        where:
        bookname|placeHolder
        "tom"|""
        "dave"|""
    }
}
