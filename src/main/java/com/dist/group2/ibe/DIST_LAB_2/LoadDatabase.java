package com.dist.group2.ibe.DIST_LAB_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BankAccountRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new BankAccount("Jan", 100)));
            log.info("Preloading " + repository.save(new BankAccount("Piet", 50)));
        };
    }
}
