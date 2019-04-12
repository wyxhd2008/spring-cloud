package com.spring.boot.docker.nginx.mysql.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EntityScan("com.spring.boot.b.common.bean")
@EnableJpaRepositories(basePackages={"com.spring.boot.docker.nginx.mysql.b.repository"})
public class DockerNginxMysqlApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(DockerNginxMysqlApplication.class, args);
    }
}
