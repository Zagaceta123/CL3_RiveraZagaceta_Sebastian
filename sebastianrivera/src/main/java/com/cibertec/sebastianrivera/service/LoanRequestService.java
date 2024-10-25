package com.cibertec.sebastianrivera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.sebastianrivera.model.LoanRequest;
import com.cibertec.sebastianrivera.repository.LoanRequestRepository;

import jakarta.transaction.Transactional;

@Service
public class LoanRequestService {
    @Autowired
    private LoanRequestRepository loanRequestRepository;

    @Transactional
    public LoanRequest requestLoan(LoanRequest loanRequest) {
        loanRequest.setStatus("PENDIENTE"); // Estado inicial
        return loanRequestRepository.save(loanRequest);
    }
}