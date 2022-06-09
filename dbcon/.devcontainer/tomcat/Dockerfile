FROM tomcat:10.1.0-jdk17
RUN rm -r /usr/local/tomcat/webapps.dist
RUN mkdir /usr/local/tomcat/webapps/dbcon

RUN curl -L https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-java_8.0.28-1debian11_all.deb -o ./jdbc.deb
RUN ar vx jdbc.deb
RUN tar Jxvf data.tar.xz
RUN mv usr/share/java/mysql-connector-java-8.0.28.jar /usr/local/tomcat/lib/
RUN rm -r control.tar.xz data.tar.xz debian-binary jdbc.deb usr/
