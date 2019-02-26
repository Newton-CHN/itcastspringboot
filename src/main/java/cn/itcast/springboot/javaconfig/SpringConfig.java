package cn.itcast.springboot.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "cn.itcast.springboot.javaconfig")
public class SpringConfig {
    @Bean
    public UserDao getUserDao() {
        return new UserDao();
    }
}
