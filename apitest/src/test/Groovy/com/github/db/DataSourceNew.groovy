package com.github.db

import com.github.file.FileService
import groovy.sql.Sql

class DataSourceNew {
    Sql sql
    FileService fileService
    def configs
    DataSourceNew(){
        fileService = new FileService()
        configs = fileService.getConfigs('./src/test/resources/com/github/data/config.yml')
    }
    Sql getSql(){
        if(!sql){
            def mysqlDB=[
                    driver:'com.mysql.jdbc.Driver',
                    url:configs.stable.db.url+'?useSSL=false',
                    user:configs.stable.db.user,
                    password:configs.stable.db.passowrd
            ]
//            println mysqlDB.url
//            println mysqlDB.user
//            println mysqlDB.passowrd
//            println mysqlDB.driver
//            sql = Sql.newInstance(mysqlDB.url, mysqlDB.user, mysqlDB.password, mysqlDB.driver)
        }
    }
}
