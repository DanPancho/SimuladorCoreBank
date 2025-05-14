
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotNull;




/**
 * ConsultaDocumentPrtryMsgGrpHdrSttInf
 */

public class ConsultaDocumentPrtryMsgGrpHdrSttInf {
  public static final String SERIALIZED_NAME_STTLM_MTD = "SttlmMtd";
  @JsonProperty(SERIALIZED_NAME_STTLM_MTD)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String sttlmMtd;

  public ConsultaDocumentPrtryMsgGrpHdrSttInf() {
  }

  public ConsultaDocumentPrtryMsgGrpHdrSttInf sttlmMtd(@Nonnull String sttlmMtd) {
    this.sttlmMtd = sttlmMtd;
    return this;
  }

  /**
   * Get sttlmMtd
   * @return sttlmMtd
   */
  @Nonnull
  public String getSttlmMtd() {
    return sttlmMtd;
  }

  public void setSttlmMtd(@Nonnull String sttlmMtd) {
    this.sttlmMtd = sttlmMtd;
  }
}

