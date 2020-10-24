# OpenSpaceHack_SuperHleb_BagTracker
команда для запуска приложения, предварительно нужно вставить данные для подключения у БД  
docker run --net=host -p 8080:8080 -e DB_URL='' -e DB_USER='' -e DB_PWD='' --name bug-repo nuod/open-space-hack_super-hleb_bag-tracker