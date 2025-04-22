# 使用 OpenJDK 作为基础镜像
FROM openjdk:17-jdk-slim
# 设置工作目录
WORKDIR /app
# 复制项目的 JAR 文件到容器中
COPY target/your-spring-boot-app.jar app.jar
# 暴露应用程序的端口
EXPOSE 8080
# 启动 Spring Boot 应用程序
CMD ["java", "-jar", "app.jar"]