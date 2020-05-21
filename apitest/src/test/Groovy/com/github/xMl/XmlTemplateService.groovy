package com.github.xMl

import org.apache.velocity.VelocityContext
import org.apache.velocity.app.VelocityEngine

class XmlTemplateService {
    VelocityEngine velocityEngine = new VelocityEngine()
    VelocityContext velocityContext = new VelocityContext()
    StringWriter stringWriter = new StringWriter()

    def getAddXmlDataBody(addXmlData) {
        velocityContext.put("addXmlData", addXmlData)
        velocityEngine.getTemplate("src/test/resources/com/github/data/addXmlData.vm").merge(velocityContext, stringWriter)   //这里写入自己创建的vm文件地址
        stringWriter.toString()
    }
}
