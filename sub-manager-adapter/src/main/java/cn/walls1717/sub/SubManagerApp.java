package cn.walls1717.sub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SubManagerApp {

    public static void main(String[] args) {
        SpringApplication.run(SubManagerApp.class, args);
    }

}
