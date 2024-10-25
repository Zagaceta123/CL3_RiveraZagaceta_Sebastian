package com.cibertec.sebastianrivera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.sebastianrivera.model.Transaction;
import com.cibertec.sebastianrivera.repository.TransactionRepository;

import jakarta.transaction.Transactional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public Transaction transferFunds(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}