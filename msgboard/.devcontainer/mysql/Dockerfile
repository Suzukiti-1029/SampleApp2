FROM mysql:5.7

COPY init/* /docker-entrypoint-initdb.d/
COPY config/* /etc/mysql/conf.d/