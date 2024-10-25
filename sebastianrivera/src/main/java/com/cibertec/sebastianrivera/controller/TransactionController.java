package com.cibertec.sebastianrivera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.sebastianrivera.model.Transaction;
import com.cibertec.sebastianrivera.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> transferFunds(@RequestBody Transaction transaction) {
        Transaction newTransaction = transactionService.transferFunds(transaction);
        return ResponseEntity.ok(newTransaction);
    }
}