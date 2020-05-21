package com.github.velocity

import org.apache.velocity.VelocityContext
import org.apache.velocity.app.VelocityEngine

class TemplateService {
    VelocityEngine velocityEngine=new VelocityEngine()
    VelocityContext velocityContext=new VelocityContext()
    StringWriter stringWriter=new StringWriter()
    def getAddUserRequestBody(addUserBody){
        velocityContext.put("addUserBody",addUserBody)
        velocityEngine.getTemplate("src/test/resources/com/github/data/addUserTemplate.json").merge(velocityContext,stringWriter)
        stringWriter.toString()
        // 上面三行属于固定写法，目的是把数据对象addUserBody和模版文件进行merge
    }
}
