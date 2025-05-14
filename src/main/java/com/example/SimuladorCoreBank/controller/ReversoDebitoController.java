package com.example.SimuladorCoreBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebito;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponse;
import com.example.SimuladorCoreBank.service.IResponseRevDebitoService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PagoDirectoSimulador")
public class ReversoDebitoController {

    @Autowired
    private IResponseRevDebitoService responseRevDebitoService;

    @PostMapping("/reverso-debito")
    public ResponseEntity<ReversoDebitoResponse> reversoDebito(@Valid @RequestBody ReversoDebito request) {
        return ResponseEntity.ok(responseRevDebitoService.makeResponse());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
        return ResponseEntity.badRequest().body("Error: " + errorMessage);
    }
}
