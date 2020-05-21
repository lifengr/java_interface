package com.github.db

import groovy.sql.Sql

//负责数据库的连接
class DataSources {
    Sql sql

    Sql getSql() {
        if (!sql) {
            def mysqlDB = [
                    driver  : 'com.mysql.jdbc.Driver',
                    url     : 'jdbc:mysql://192.168.2.151:3306/organization_admin?useSSL=false',
                    user    : 'root',          //这里写入安装mysql是设置的用户名
                    password: '30rtom'     //这里写入安装mysql时设置的密码
            ]
            sql = Sql.newInstance(mysqlDB.url, mysqlDB.user, mysqlDB.password, mysqlDB.driver)
            // 连接mysql数据库固定写法
        }
        sql
    }
}
