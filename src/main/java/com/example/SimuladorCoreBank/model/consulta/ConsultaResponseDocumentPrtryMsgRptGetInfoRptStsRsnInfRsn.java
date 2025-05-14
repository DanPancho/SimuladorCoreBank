
package com.example.SimuladorCoreBank.model.consulta;

import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;






/**
 * ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn
 */

public class ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn {
  public static final String SERIALIZED_NAME_PRTRY = "Prtry";
  @JsonProperty(SERIALIZED_NAME_PRTRY)
  @Nonnull

  private String prtry;

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn() {
  }

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn prtry(@Nonnull String prtry) {
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

