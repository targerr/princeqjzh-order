#!/bin#kill tomcat pid#有错的shell
# Execute shell 配置的pwd可以获取该目录的路径
# export PROJ_PATH='pwd' jenkins路径
# export TOMCAT_APP_PATH=tomcat路径

#### bash函数

# 将应用停止
#stop.sh
#!/bin/bash
echo "Stopping SpringBoot Application"
pid=`ps -ef | grep spring-boot-docker-order.war | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
   kill -9 $pid
fi

cd $PROJ_PATH
mvn clean install

#此处spring-boot-docker-order.war根据自己的jar包名称修改