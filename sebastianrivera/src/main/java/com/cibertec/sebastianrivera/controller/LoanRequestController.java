package com.cibertec.sebastianrivera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.sebastianrivera.model.LoanRequest;
import com.cibertec.sebastianrivera.service.LoanRequestService;

@RestController
@RequestMapping("/api/loan-requests")
public class LoanRequestController {
    @Autowired
    private LoanRequestService loanRequestService;

    @PostMapping
    public ResponseEntity<LoanRequest> requestLoan(@RequestBody LoanRequest loanRequest) {
        LoanRequest newLoanRequest = loanRequestService.requestLoan(loanRequest);
        return ResponseEntity.ok(newLoanRequest);
    }
}