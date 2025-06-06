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
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgt
 */

public class DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgt {
  public static final String SERIALIZED_NAME_FIN_INSTN_ID = "FinInstnId";
  @JsonProperty(SERIALIZED_NAME_FIN_INSTN_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnId finInstnId;

  public DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgt() {
  }

  public DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgt finInstnId(
      @Nonnull DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnId finInstnId) {
    this.finInstnId = finInstnId;
    return this;
  }

  /**
   * Get finInstnId
   * 
   * @return finInstnId
   */
  @Nonnull
  public DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnId getFinInstnId() {
    return finInstnId;
  }

  public void setFinInstnId(@Nonnull DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnId finInstnId) {
    this.finInstnId = finInstnId;
  }

}
