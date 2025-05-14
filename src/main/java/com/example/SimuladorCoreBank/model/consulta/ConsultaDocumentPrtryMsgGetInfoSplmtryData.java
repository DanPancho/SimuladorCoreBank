
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfoSplmtryData
 */

public class ConsultaDocumentPrtryMsgGetInfoSplmtryData {
  public static final String SERIALIZED_NAME_ENVLP = "Envlp";
  @JsonProperty(SERIALIZED_NAME_ENVLP)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp envlp;

  public ConsultaDocumentPrtryMsgGetInfoSplmtryData() {
  }

  public ConsultaDocumentPrtryMsgGetInfoSplmtryData envlp(@Nonnull ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp envlp) {
    this.envlp = envlp;
    return this;
  }

  /**
   * Get envlp
   * @return envlp
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp getEnvlp() {
    return envlp;
  }

  public void setEnvlp(@Nonnull ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp envlp) {
    this.envlp = envlp;
  }
}

