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

import jakarta.annotation.Nullable;

/**
 * DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts
 */

public class DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts {
  public static final String SERIALIZED_NAME_CONF_CODE = "ConfCode";
  @JsonProperty(SERIALIZED_NAME_CONF_CODE)
  @Nullable
  private String confCode;

  public DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts() {
  }

  public DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts confCode(@Nullable String confCode) {
    this.confCode = confCode;
    return this;
  }

  /**
   * Get confCode
   * 
   * @return confCode
   */
  @Nullable
  public String getConfCode() {
    return confCode;
  }

  public void setConfCode(@Nullable String confCode) {
    this.confCode = confCode;
  }

}
