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
 * CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctId
 */

public class CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctId {
  public static final String SERIALIZED_NAME_OTHR = "Othr";
  @JsonProperty(SERIALIZED_NAME_OTHR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctIdOthr othr;

  public CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctId() {
  }

  public CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctId othr(
      @Nonnull CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctIdOthr othr) {
    this.othr = othr;
    return this;
  }

  /**
   * Get othr
   * 
   * @return othr
   */
  @Nonnull
  public CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctIdOthr getOthr() {
    return othr;
  }

  public void setOthr(@Nonnull CreditoRequestDocumentFIToFICstmrCdtTrfCdtTrfTxInfDbtrAcctIdOthr othr) {
    this.othr = othr;
  }
}
