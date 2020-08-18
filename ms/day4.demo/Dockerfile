FROM tomcat:jdk11-openjdk
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/day4.demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]