FROM frolvlad/alpine-java
EXPOSE 8080
VOLUME /tmp
COPY httpcodes-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
RUN adduser -D myuser
USER myuser
CMD Application --bind 0.0.0.0:$PORT wsgi