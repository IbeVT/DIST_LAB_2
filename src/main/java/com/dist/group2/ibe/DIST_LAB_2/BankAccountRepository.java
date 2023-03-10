package com.dist.group2.ibe.DIST_LAB_2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
    Optional<BankAccount> findByName(String name);
}
