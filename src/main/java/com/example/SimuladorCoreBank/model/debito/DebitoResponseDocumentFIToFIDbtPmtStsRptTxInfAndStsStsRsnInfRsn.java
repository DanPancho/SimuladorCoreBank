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
 * DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn
 */

public class DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn {
  public static final String SERIALIZED_NAME_PRTRY = "Prtry";
 @JsonProperty(SERIALIZED_NAME_PRTRY)
  @Nonnull
  private String prtry;

  public DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn() {
  }

  public DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn prtry(@Nonnull String prtry) {
    this.prtry = prtry;
    return this;
  }

  /**
   * Get prtry
   * @return prtry
   */
  @Nonnull
  public String getPrtry() {
    return prtry;
  }

  public void setPrtry(@Nonnull String prtry) {
    this.prtry = prtry;
  }

}

