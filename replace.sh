#replace.sh 用于将上次构建的结果备份，然后将新的构建结果移动到合适的位置
#!/bin/bash
# 先判断文件是否存在，如果存在，则备份
# cd  /root/.jenkins/workspace/gitHub/target 可以用下面代替
 cd $PROJ_PATH/target

# 备份
cp spring-boot-docker-order.war /opt/soft/spring-boot-docker-order.war
# 备份重命名
cd /opt/soft
mv spring-boot-docker-order.war spring-boot-docker-order.war.`date +%Y%m%d%H%M%S`
 echo "--------------copy------------"
cd $PROJ_PATH/target
echo "--------------copy end------------"
#此处 /opt/soft/spring-boot-docker-order.war根据自己实际jar包名称和路径修改