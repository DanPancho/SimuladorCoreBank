
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfoCdtrAcctId
 */

public class ConsultaDocumentPrtryMsgGetInfoCdtrAcctId {
  public static final String SERIALIZED_NAME_OTHR = "Othr";
  @JsonProperty(SERIALIZED_NAME_OTHR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoCdtrAcctIdOthr othr;

  public ConsultaDocumentPrtryMsgGetInfoCdtrAcctId() {
  }

  public ConsultaDocumentPrtryMsgGetInfoCdtrAcctId othr(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrAcctIdOthr othr) {
    this.othr = othr;
    return this;
  }

  /**
   * Get othr
   * @return othr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoCdtrAcctIdOthr getOthr() {
    return othr;
  }

  public void setOthr(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrAcctIdOthr othr) {
    this.othr = othr;
  }
}

