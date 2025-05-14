
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfoDbtrId
 */

public class ConsultaDocumentPrtryMsgGetInfoDbtrId {
  public static final String SERIALIZED_NAME_PRVT_ID = "PrvtId";
  @JsonProperty(SERIALIZED_NAME_PRVT_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId prvtId;

  public ConsultaDocumentPrtryMsgGetInfoDbtrId() {
  }

  public ConsultaDocumentPrtryMsgGetInfoDbtrId prvtId(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId prvtId) {
    this.prvtId = prvtId;
    return this;
  }

  /**
   * Get prvtId
   * @return prvtId
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId getPrvtId() {
    return prvtId;
  }

  public void setPrvtId(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtrIdPrvtId prvtId) {
    this.prvtId = prvtId;
  }
}

