
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;


import jakarta.annotation.Nullable;





/**
 * ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf
 */

public class ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf {
  public static final String SERIALIZED_NAME_RSN = "Rsn";
  @JsonProperty(SERIALIZED_NAME_RSN)
  @Nonnull

  private ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn rsn;

  public static final String SERIALIZED_NAME_ADDTL_INF = "AddtlInf";
  @JsonProperty(SERIALIZED_NAME_ADDTL_INF)
  @Nullable
  private String addtlInf;

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf() {
  }

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf rsn(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn rsn) {
    this.rsn = rsn;
    return this;
  }

  /**
   * Get rsn
   * @return rsn
   */
  @Nonnull
  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn getRsn() {
    return rsn;
  }

  public void setRsn(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn rsn) {
    this.rsn = rsn;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf addtlInf(@Nullable String addtlInf) {
    this.addtlInf = addtlInf;
    return this;
  }

  /**
   * Get addtlInf
   * @return addtlInf
   */
  @Nullable
  public String getAddtlInf() {
    return addtlInf;
  }

  public void setAddtlInf(@Nullable String addtlInf) {
    this.addtlInf = addtlInf;
  }
}

