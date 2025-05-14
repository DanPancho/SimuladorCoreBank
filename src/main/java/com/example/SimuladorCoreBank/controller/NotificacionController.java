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

import com.example.SimuladorCoreBank.model.notificacion.NotificacionRequest;
import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuesta;
import com.example.SimuladorCoreBank.service.IResponseNotificacionService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PagoDirectoSimulador")
public class NotificacionController {
    
    @Autowired
    private IResponseNotificacionService responseNotificacionService;

    @PostMapping("/notificacion")
    public ResponseEntity<NotificacionRespuesta> notificacion(@Valid @RequestBody NotificacionRequest request) {
        return ResponseEntity.ok(responseNotificacionService.makeResponse());   
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
        return ResponseEntity.badRequest().body("Error: " + errorMessage);
    }
}
