package com.dist.group2.ibe.DIST_LAB_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    private final BankAccountRepository repository;
    Logger logger = LoggerFactory.getLogger(BankController.class);

    BankController(BankAccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getBalance")
    public double getBalance(@RequestParam(value = "name") String name) {
        logger.info("getBalance method, name = " + name);
        BankAccount bankAccount = repository.findByName(name)
                .orElseThrow(() -> new BankAccountNotFoundException(name));
        return bankAccount.getBalance();
    }
}

class BankAccountNotFoundException extends RuntimeException {
    BankAccountNotFoundException(String name) {
        super("Could not find bank account  of " + name);
    }
}