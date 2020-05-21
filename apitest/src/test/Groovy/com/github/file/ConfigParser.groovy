package com.github.file
class ConfigParser {
    FileService fileService

    ConfigParser() {
        fileService = new FileService()
    }

    def getConfigs(String configFilePath) {
        def configs = fileService.getConfigs(configFilePath)       //传入yaml文件的路径，然后获取整个yaml文件的内容
        def sysEnv = System.getenv("ACTIVE_ENV")
        def active = sysEnv ? sysEnv : configs.active
        configs.putAll(configs.get(active))
        configs
    }

    def getGlobalConfig() {
        def configs
        configs = getConfigs("src/test/resources/com/github/data/config.yml")
        configs
    }
}
