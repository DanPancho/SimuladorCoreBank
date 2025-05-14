
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


public class ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId {
  public static final String SERIALIZED_NAME_OTHR = "Othr";
  @JsonProperty(SERIALIZED_NAME_OTHR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr othr;

  public ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId() {
  }

  public ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId othr(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr othr) {
    this.othr = othr;
    return this;
  }

  /**
   * Get othr
   * @return othr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr getOthr() {
    return othr;
  }

  public void setOthr(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr othr) {
    this.othr = othr;
  }
}

