package com.github.db
//存放 SQL 常量
class ConstantSql {
    //查询多行
    static final getUserInfo="SELECT * FROM ent_staff WHERE mobile_number=\"+8613800000000\" or mobile_number=\"+8613810000010\""
    //
    static final getStaffInfo="SELECT id,name,sex,mobile_number FROM  ent_staff WHERE name=?"
}
