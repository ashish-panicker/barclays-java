FROM tomcat:jdk11
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/ms.demo1-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]