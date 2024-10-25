package com.cibertec.sebastianrivera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.sebastianrivera.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}