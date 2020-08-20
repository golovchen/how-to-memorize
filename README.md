![Docker Cloud Build Status](https://img.shields.io/docker/cloud/build/golovchen/tomcat-maven-docker-template)

[Docker hub](https://hub.docker.com/r/golovchen/tomcat-maven-docker-template)

1. `docker build -t tomcat-template .`
2. `docker run -it --rm --publish 80:80 tomcat-template`
3. Visit http://localhost