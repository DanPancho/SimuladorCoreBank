
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId
 */

public class ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId {
  public static final String SERIALIZED_NAME_OTHR = "Othr";
  @JsonProperty(SERIALIZED_NAME_OTHR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgIdOthr othr;

  public ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId() {
  }

  public ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId othr(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgIdOthr othr) {
    this.othr = othr;
    return this;
  }

  /**
   * Get othr
   * @return othr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgIdOthr getOthr() {
    return othr;
  }

  public void setOthr(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgIdOthr othr) {
    this.othr = othr;
  }
}

