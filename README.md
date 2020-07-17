# Cat-Demo

This is a demo for building and monitoring a spring boot application
with Grafana und Prometheus.

# Build app

```
gradlew.bat build 
```

# Run app

```
java -jar ./build/libs/spring-monitoring-0.0.1-SNAPSHOT.jar
```

# Run as docker container

```
docker build -t cat-demo .
```

# Run Grafana, Prometheus and Cat-Demo with Docker-Compose

```
docker-compose up
```
