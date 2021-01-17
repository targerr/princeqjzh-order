#!/bin#kill tomcat pid#有错的shell
# Execute shell 配置的pwd可以获取该目录的路径
# export PROJ_PATH='pwd' jenkins路径
# export TOMCAT_APP_PATH=tomcat路径

#### bash函数


pidlist=`ps -ef|grep tomcat|grep -v "grep"|awk '{print $2}'`
function stop(){
if [ "$pidlist" == "" ]
  then
    echo "----tomcat 已经关闭----"

 else
    echo "tomcat 进程号 :$pidlist"
    kill -9 $pidlist
    echo "KILL $pidlist:"
fi
}

cd $PROJ_PATH/order
mvn clean install

#停止tomcat
stop

# 删除所有项目
rm -rf $TOMCAT_APP_PATH/webapps/ROOT*
rm -rf $TOMCAT_APP_PATH/webapps/spring-boot-docker-order.war

#复制工程
cp $PROJ_PATH/order/target/spring-boot-docker-order.war  $TOMCAT_APP_PATH/webapps/
sleep 3s
#重命名
cd $TOMCAT_APP_PATH/webapps/
mv spring-boot-docker-order.war ROOT.war
#启动
cd  $TOMCAT_APP_PATH/bin
./startup.sh
