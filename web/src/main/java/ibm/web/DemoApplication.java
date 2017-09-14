package ibm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

/**
 * Created by ZhiDongWang on 9/14/2017.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"ibm.persistence"})
@EntityScan(basePackages = {"ibm.domain"})
@ComponentScan(basePackages = {"ibm.persistence", "ibm.domain", "ibm.web"})
public class DemoApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class);
    }
}
