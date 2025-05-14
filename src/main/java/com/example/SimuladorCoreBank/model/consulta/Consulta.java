package com.example.SimuladorCoreBank.model.consulta;

import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Consulta {
  
  public static final String SERIALIZED_NAME_DOCUMENT = "Document";

  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @JsonProperty(SERIALIZED_NAME_DOCUMENT) 
  @Valid
  private ConsultaDocument document;

  public Consulta() {
  }

  public Consulta document(@Nonnull ConsultaDocument document) {
    this.document = document;
    return this;
  } 
  
  @Nonnull
  public ConsultaDocument getDocument() {
    return document;
  }

  public void setDocument(@Nonnull ConsultaDocument document) {
    this.document = document;
  }
}
