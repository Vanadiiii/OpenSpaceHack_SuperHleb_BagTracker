# OpenSpaceHack_SuperHleb_BagTracker
после загрузки репозитория запустить 
mvn clean install
после запустить сборку контейнера
docker build -t nuod/open-space-hack_super-hleb_bag-tracker:latest .
команда для запуска приложения  
docker run -p 8080:8080 --name bug-repo nuod/open-space-hack_super-hleb_bag-tracker
