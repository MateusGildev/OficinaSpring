package br.com.Project.config;

import br.com.Project.services.DbService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    @Autowired
    private DbService dbService;

    @PostConstruct
    public void initDB(){
        this.dbService.initDB();
    }
}
