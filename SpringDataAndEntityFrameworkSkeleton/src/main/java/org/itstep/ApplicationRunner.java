package org.itstep;

import org.itstep.config.DataBaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ApplicationRunner 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(new Class<?>[] {ApplicationRunner.class, DataBaseConfig.class}, args);
    }
}
