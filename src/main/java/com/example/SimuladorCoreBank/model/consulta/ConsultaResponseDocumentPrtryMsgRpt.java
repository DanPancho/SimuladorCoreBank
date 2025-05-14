
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;







/**
 * ConsultaResponseDocumentPrtryMsgRpt
 */

public class ConsultaResponseDocumentPrtryMsgRpt {
  public static final String SERIALIZED_NAME_GRP_HDR = "GrpHdr";
  @JsonProperty(SERIALIZED_NAME_GRP_HDR)
  @Nonnull

  private ConsultaDocumentPrtryMsgGrpHdr grpHdr;

  public static final String SERIALIZED_NAME_GET_INFO_RPT = "GetInfoRpt";
  @JsonProperty(SERIALIZED_NAME_GET_INFO_RPT)
  @Nonnull

  private ConsultaResponseDocumentPrtryMsgRptGetInfoRpt getInfoRpt;

  public ConsultaResponseDocumentPrtryMsgRpt() {
  }

  public ConsultaResponseDocumentPrtryMsgRpt grpHdr(@Nonnull ConsultaDocumentPrtryMsgGrpHdr grpHdr) {
    this.grpHdr = grpHdr;
    return this;
  }

  /**
   * Get grpHdr
   * @return grpHdr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdr getGrpHdr() {
    return grpHdr;
  }

  public void setGrpHdr(@Nonnull ConsultaDocumentPrtryMsgGrpHdr grpHdr) {
    this.grpHdr = grpHdr;
  }


  public ConsultaResponseDocumentPrtryMsgRpt getInfoRpt(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRpt getInfoRpt) {
    this.getInfoRpt = getInfoRpt;
    return this;
  }

  /**
   * Get getInfoRpt
   * @return getInfoRpt
   */
  @Nonnull
  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt getGetInfoRpt() {
    return getInfoRpt;
  }

  public void setGetInfoRpt(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRpt getInfoRpt) {
    this.getInfoRpt = getInfoRpt;
  }
}

