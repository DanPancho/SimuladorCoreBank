
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId
 */

public class ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId {
  public static final String SERIALIZED_NAME_OTHR = "Othr";
  @JsonProperty(SERIALIZED_NAME_OTHR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtIdOthr othr;

  public ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId() {
  }

  public ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId othr(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtIdOthr othr) {
    this.othr = othr;
    return this;
  }

  /**
   * Get othr
   * @return othr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtIdOthr getOthr() {
    return othr;
  }

  public void setOthr(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtIdOthr othr) {
    this.othr = othr;
  }
}

