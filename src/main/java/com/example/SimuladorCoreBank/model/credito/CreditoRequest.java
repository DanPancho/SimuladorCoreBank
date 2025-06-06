/*
 * Credito Core Banking | Servicio Pago Directo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.SimuladorCoreBank.model.credito;

import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreditoRequest
 */

public class CreditoRequest {
  public static final String SERIALIZED_NAME_DOCUMENT = "Document";
  @JsonProperty(SERIALIZED_NAME_DOCUMENT)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private CreditoRequestDocument document;

  public CreditoRequest() {
  }

  public CreditoRequest document(@Nonnull CreditoRequestDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   */
  @Nonnull
  public CreditoRequestDocument getDocument() {
    return document;
  }

  public void setDocument(@Nonnull CreditoRequestDocument document) {
    this.document = document;
  }
}

