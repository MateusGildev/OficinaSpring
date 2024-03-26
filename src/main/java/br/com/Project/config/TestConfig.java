package br.com.Project.config;

import br.com.Project.services.DbService;
import jakarta.annotation.PostConstruct;
import org.aspectj.apache.bcel.util.ClassPath;
import org.hibernate.annotations.processing.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    @Autowired
    private DbService dbService;

    @PostConstruct
    public void initDB(){
        this.dbService.initDB();
    }
}
