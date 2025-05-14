
package com.example.SimuladorCoreBank.model.consulta;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;

/**
 * ConsultaResponseDocument
 */

public class ConsultaResponseDocument {
  public static final String SERIALIZED_NAME_HEADER = "Header";
  @JsonProperty(SERIALIZED_NAME_HEADER)
  @Nonnull

  private ConsultaDocumentHeader header;

  public static final String SERIALIZED_NAME_PRTRY_MSG_RPT = "PrtryMsgRpt";
  @JsonProperty(SERIALIZED_NAME_PRTRY_MSG_RPT)
  @Nonnull

  private ConsultaResponseDocumentPrtryMsgRpt prtryMsgRpt;

  public ConsultaResponseDocument() {
  }

  public ConsultaResponseDocument header(@Nonnull ConsultaDocumentHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * 
   * @return header
   */
  @Nonnull
  public ConsultaDocumentHeader getHeader() {
    return header;
  }

  public void setHeader(@Nonnull ConsultaDocumentHeader header) {
    this.header = header;
  }

  public ConsultaResponseDocument prtryMsgRpt(@Nonnull ConsultaResponseDocumentPrtryMsgRpt prtryMsgRpt) {
    this.prtryMsgRpt = prtryMsgRpt;
    return this;
  }

  /**
   * Get prtryMsgRpt
   * 
   * @return prtryMsgRpt
   */
  @Nonnull
  public ConsultaResponseDocumentPrtryMsgRpt getPrtryMsgRpt() {
    return prtryMsgRpt;
  }

  public void setPrtryMsgRpt(@Nonnull ConsultaResponseDocumentPrtryMsgRpt prtryMsgRpt) {
    this.prtryMsgRpt = prtryMsgRpt;
  }
}
