/*
 * Debito Core Banking | Servicio Pago Directo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.example.SimuladorCoreBank.model.debito;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;

/**
 * DebitoResponse
 */

public class DebitoResponse {
  public static final String SERIALIZED_NAME_DOCUMENT = "Document";
  @JsonProperty(SERIALIZED_NAME_DOCUMENT)
  @Nonnull
  private DebitoResponseDocument document;

  public DebitoResponse() {
  }

  public DebitoResponse document(@Nonnull DebitoResponseDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * 
   * @return document
   */
  @Nonnull
  public DebitoResponseDocument getDocument() {
    return document;
  }

  public void setDocument(@Nonnull DebitoResponseDocument document) {
    this.document = document;
  }

}
