
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGrpHdrInstdAgt
 */

public class ConsultaDocumentPrtryMsgGrpHdrInstdAgt {
  public static final String SERIALIZED_NAME_FIN_INSTN_ID = "FinInstnId";
  @JsonProperty(SERIALIZED_NAME_FIN_INSTN_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId finInstnId;

  public ConsultaDocumentPrtryMsgGrpHdrInstdAgt() {
  }

  public ConsultaDocumentPrtryMsgGrpHdrInstdAgt finInstnId(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId finInstnId) {
    this.finInstnId = finInstnId;
    return this;
  }

  /**
   * Get finInstnId
   * @return finInstnId
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId getFinInstnId() {
    return finInstnId;
  }

  public void setFinInstnId(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId finInstnId) {
    this.finInstnId = finInstnId;
  }
}

