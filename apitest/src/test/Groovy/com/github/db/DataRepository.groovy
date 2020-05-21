package com.github.db

//存放操作数据库的方法
class DataRepository extends DataSourceNew {
    def getUserInfo(){
        def userInfo=sql.rows(ConstantSql.getUserInfo)//查询多行
        userInfo ? userInfo :""//空保护
    }
    def getStaffInfo(name){
        def staffinfo=sql.firstRow(ConstantSql.getStaffInfo,[name])
    }
}
