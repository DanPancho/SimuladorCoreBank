package com.example.SimuladorCoreBank.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SimuladorCoreBank.model.debito.DebitoRequest;
import com.example.SimuladorCoreBank.model.debito.DebitoResponse;
import com.example.SimuladorCoreBank.service.IResponseDebitoService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PagoDirectoSimulador")
public class DebitoController {

    @Autowired
    private IResponseDebitoService responseDebitoService;

    @PostMapping("/debito")
    public ResponseEntity<DebitoResponse> debito(@Valid @RequestBody DebitoRequest request) {
        return ResponseEntity.ok(responseDebitoService.makeResponse());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
        return ResponseEntity.badRequest().body("Error: " + errorMessage);
    }
}
