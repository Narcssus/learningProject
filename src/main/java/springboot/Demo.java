package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Demo.class);
    }
    public static void main(String[] args) {
        // 整个程序入口，启动springboot项目，创建内置tomcat服务器，使用tomct加载springmvc注解启动类
        SpringApplication.run(Demo.class, args);
    }

}
