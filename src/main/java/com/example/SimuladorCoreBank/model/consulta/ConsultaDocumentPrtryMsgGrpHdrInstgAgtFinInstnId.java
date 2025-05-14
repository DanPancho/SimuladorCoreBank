
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnId
 */

public class ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnId {
  public static final String SERIALIZED_NAME_OTHR = "Othr";
  @JsonProperty(SERIALIZED_NAME_OTHR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnIdOthr othr;

  public ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnId() {
  }

  public ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnId othr(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnIdOthr othr) {
    this.othr = othr;
    return this;
  }

  /**
   * Get othr
   * @return othr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnIdOthr getOthr() {
    return othr;
  }

  public void setOthr(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnIdOthr othr) {
    this.othr = othr;
  }
}

