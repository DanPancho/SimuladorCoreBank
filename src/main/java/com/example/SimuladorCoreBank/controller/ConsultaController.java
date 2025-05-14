package com.example.SimuladorCoreBank.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SimuladorCoreBank.model.consulta.Consulta;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponse;
import com.example.SimuladorCoreBank.service.IResponseConsultaService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PagoDirectoSimulador")
public class ConsultaController {

    @Autowired
    private IResponseConsultaService responseConsultaService;

    @PostMapping("/consulta")
    public ResponseEntity<ConsultaResponse> Consulta(@Valid @RequestBody Consulta request) {

        ConsultaResponse consultaResponse = responseConsultaService.makeResponse();
        return ResponseEntity.ok(consultaResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
        return ResponseEntity.badRequest().body("Error: " + errorMessage);
    }
}
