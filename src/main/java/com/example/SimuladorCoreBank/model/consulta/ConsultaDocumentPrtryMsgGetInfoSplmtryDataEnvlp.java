
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp
 */

public class ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp {
  public static final String SERIALIZED_NAME_CNTS = "Cnts";
  @JsonProperty(SERIALIZED_NAME_CNTS)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts cnts;

  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp() {
  }

  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlp cnts(@Nonnull ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts cnts) {
    this.cnts = cnts;
    return this;
  }

  /**
   * Get cnts
   * @return cnts
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts getCnts() {
    return cnts;
  }

  public void setCnts(@Nonnull ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts cnts) {
    this.cnts = cnts;
  }
}

