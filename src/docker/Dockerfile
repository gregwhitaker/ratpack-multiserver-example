FROM openjdk:8-jre-alpine
MAINTAINER Greg Whitaker <greg@netifi.com>
EXPOSE 5050
EXPOSE 5051
COPY build/distributions/ratpack-multiserver-example.zip /opt/ratpack-multiserver-example/
RUN unzip /opt/ratpack-multiserver-example/ratpack-multiserver-example.zip -d /opt/ratpack-multiserver-example
WORKDIR /opt/ratpack-multiserver-example/ratpack-multiserver-example
CMD ["./bin/ratpack-multiserver-example", "-fg"]
