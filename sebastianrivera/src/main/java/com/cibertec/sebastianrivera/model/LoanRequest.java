package com.cibertec.sebastianrivera.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class LoanRequest {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Long userId;
	    private Double amount;
	    private String status; // Ejemplo: "PENDIENTE", "APROBADO", "RECHAZADO"
}
