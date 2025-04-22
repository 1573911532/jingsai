package com.sang.subjectcompetition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling/*定时任务*/
public class StartApplication {

    public static void main(String[] args) {
        org.springframework.context.ApplicationContext ac = SpringApplication.run(StartApplication.class, args);
        //启动完成后，自动打开浏览器
        String port = ac.getEnvironment().getProperty("server.port");
        String IPPort = "http://localhost:" + (port == null ? 8080 : port);
        System.out.println("后端启动完成：" + IPPort);
    }

}
