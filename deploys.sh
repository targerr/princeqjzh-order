BUILD_ID=DONTKILLME
. /etc/profile
export PROJ_PATH=`pwd`

sh $PROJ_PATH/stop.sh
sh $PROJ_PATH/replace.sh

cd $PROJ_PATH/target


nohup java -jar spring-boot-docker-order.war &