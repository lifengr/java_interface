//package com.github.file
//
//import spock.lang.Specification
//
////class Case extends Specification {
//    FileService fileService
//    def setup(){
//        fileService=new FileService();
//    }
//    def "should create and read txt file successfully"(){
//        given:"create txt file"
//        def file=fileService.createFile('./src/test/resources/com/github/data/test2.txt');
//        when:"write some content to the file"
//        // 支持通过<<写入文件内容
//        file << "name,age,address\n"
//        file << "Tom,100,chengdu\n"
//        then:"print file content"
//        // 读取txt文件内容
//        def lines=file.readLines()
//        lines.each {println it}
//        and:"delete file"
//        file.delete()
//    }
//    def "should read yml file successfully"(){
//        given:"no given"
//        when:"get the csv data"
//        def configs=fileService.getConfigs('./src/test/resources/com/github/data/config.yml')
//        then:"print data"
//        println configs.stable.db.url
//        println configs.active
//    }
//    def "should read csv file successfully"(){
//        given:"no given"
//        when:"get the csv file data"
//        def csvContent=fileService.getCsvFileContent('./src/test/resources/com/github/data/test.csv',",")
//        then:"println the data"
//        csvContent.each {it->println it.name+":"+it.age+":"+it.address}
//    }
//    def "should read json file successfully"() {
//        given: ""
//        when: "get json file data"
//        def jsonContent = fileService.getCollectionFromJsonFile('./src/test/resources/com/github/data/test.json')   //这里请写入自己创建的文件路径
//        then: "println the data"
//        println jsonContent.pipelineName   //打印的值与json文件内容相同则说明正确获取到文件内容
//        println jsonContent.sonar.coverage
//        def stage = jsonContent.stages.find { it -> it.name == "stage2" }  //通过find方法查找json文件中stages对象下name等于“stage2”的对象
//        println stage.id
//        println stage.duration
//    }
//    def "should read xml file successfully"() {
//        given: ""
//        when: "get json file data"
//        def xmlContent = fileService.getCollectionFromXMLFile('./src/test/resources/com/github/data/test.xml')   //这里请写入自己创建的文件路径
//        then: "println the data"
//        xmlContent.person.each{ println it }
//        println xmlContent.person.find{ it -> it.name == "DAVE" }.age  //通过find方法查找XML文件中name等于“DAVE”的person对象，然后获取该对象下age的值
//    }
//}
