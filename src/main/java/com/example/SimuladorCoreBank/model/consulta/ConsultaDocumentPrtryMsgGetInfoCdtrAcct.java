
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfoCdtrAcct
 */

public class ConsultaDocumentPrtryMsgGetInfoCdtrAcct {
  public static final String SERIALIZED_NAME_ID = "Id";
  @JsonProperty(SERIALIZED_NAME_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoCdtrAcctId id;

  public ConsultaDocumentPrtryMsgGetInfoCdtrAcct() {
  }

  public ConsultaDocumentPrtryMsgGetInfoCdtrAcct id(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrAcctId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoCdtrAcctId getId() {
    return id;
  }

  public void setId(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrAcctId id) {
    this.id = id;
  }
}

