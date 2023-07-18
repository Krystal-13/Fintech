docker run -d \
--name fintech-mysql \
-e MYSQL_ROOT_PASSWORD="fintech" \
-e MYSQL_ROOT_USER="fintech" \
-e MYSQL_PASSWORD="fintech" \
-e MYSQL_ROOT_DATABASE="fintech" \
-p 3306:3306 \
mysql:latest
