package com.example.SimuladorCoreBank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SimuladorCoreBank.model.credito.CreditoRequest;
import com.example.SimuladorCoreBank.model.credito.CreditoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.SimuladorCoreBank.service.IResponseCreditoService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PagoDirectoSimulador")
public class PagoController {

    @Autowired
    private IResponseCreditoService responseCreditoService;

    @PostMapping("/credito")
    public ResponseEntity<CreditoResponse> credito(@Valid @RequestBody CreditoRequest request) {
        return ResponseEntity.ok(responseCreditoService.makResponse()); 
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
        return ResponseEntity.badRequest().body("Error: " + errorMessage);
    }
}
