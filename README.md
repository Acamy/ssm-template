# 项目介绍

采用阿里巴巴Druid连接池，log4j日志组件，FreeMarker模板引擎，数据库用MySQL, 通过Maven管理依赖，在该项目模板基础上可以灵活搭建出自己要实现的JavaWeb项目。

# 项目框架
![image](https://github.com/Acamy/Images/blob/master/2018-02-08_144758.png)

# 使用方法

- 在自己数据库导入resources/usertemp.sql
- 修改resources/db.properties的数据库连接属性
- 在Eclipse/Idea等IDE中导入该Maven工程, 进行编绎
- 在Tomcat部署该项目
- 通过localhost：8080/user即可进行测试

![image](https://github.com/Acamy/Images/blob/master/2018-02-08_144845.png)