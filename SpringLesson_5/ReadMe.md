скрипт для создания базы данных в консоле:
docker run --name mynewdb -e POSTGRES_DB=mynewdb -e POSTGRES_USER=myuser -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres

заходим внутрь через консоль
docker exec -it mynewdb psql -U myuser mynewdb

проверяем таблицы
\dt

select * from users;