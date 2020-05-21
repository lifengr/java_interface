package com.github.foureCourse

import groovy.json.JsonSlurper
import org.junit.Assert
import spock.lang.Specification
import static io.restassured.RestAssured.given
class SixDemo extends Specification {
    JsonSlurper jsonSlurper=new JsonSlurper()//将json字符串转换为 Groovy  的集合对象
    def "should book's price correct"(){
        given:""
        when:"get books response"
        def response=given().log().all()
                            .baseUri("http://localhost:9090")
                            .when()
                            .get("/api/getAllBooks")
                            .then().log().all()
                            .assertThat()
                            .extract().response().getBody().asString()
        then:"book's price is correct"
        def bookPrice=jsonSlurper.parseText(response).books.find{it->it.name==bookName}.price
        Assert.assertEquals("bookPrice:${bookPrice} is not correct" ,bookPrice,price)
        where:
        bookName|price
        "三国演绎"|20

    }

}
