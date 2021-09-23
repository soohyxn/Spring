package com.sparta.week06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링이 실행될 때 @Bean 을 바라보고 필요한 객체를 스프링 IoC 컨테이너에 빈으로 담는다
public class BeanConfiguration {
    @Bean // 스프링 IoC 컨테이너에 객체(빈)를 담는다
    public ProductRepository productRepository() {
        String dbId = "sa";
        String dbPassword = "";
        String dbUrl = "jdbc:h2:mem:springcoredb";
        return new ProductRepository(dbId, dbPassword, dbUrl);
    }

    @Bean
    @Autowired // 스프링 IoC 컨테이너에 있는 빈을 해당 객체에 DI(의존성 주입) 한다
    public ProductService productService(ProductRepository productRepository) {
        return new ProductService(productRepository);
    }
}