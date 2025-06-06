/*
 * Reverso Debito Core Banking | Servicio Pago Directo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.SimuladorCoreBank.model.reversoDebito;







import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlp
 */

public class ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlp {
  public static final String SERIALIZED_NAME_CNTS = "Cnts";
  @JsonProperty(SERIALIZED_NAME_CNTS)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlpCnts cnts;

  public ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlp() {
  }

  public ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlp cnts(@Nonnull ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlpCnts cnts) {
    this.cnts = cnts;
    return this;
  }

  /**
   * Get cnts
   * @return cnts
   */
  @Nonnull
  public ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlpCnts getCnts() {
    return cnts;
  }

  public void setCnts(@Nonnull ReversoDebitoDocumentFIToFIDbtPmtRvslTxInfSplmtryDataEnvlpCnts cnts) {
    this.cnts = cnts;
  }
}

