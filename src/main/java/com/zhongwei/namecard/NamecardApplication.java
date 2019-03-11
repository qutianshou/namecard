package com.zhongwei.namecard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude={HibernateJpaAutoConfiguration.class,SecurityAutoConfiguration.class})
@MapperScan("com.zhongwei.namecard.miniapp.dao")//将项目中对应的mapper类的路径加进来就可以了
public class NamecardApplication {
	
	@RequestMapping("/")
    public String index(){
		System.out.println(1111);
        return "Hello Spring Boot";
        
    }

	public static void main(String[] args) {
		SpringApplication.run(NamecardApplication.class, args);
//		System.out.println(System.currentTimeMillis());
	}

}

