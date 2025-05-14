
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsg
 */

public class ConsultaDocumentPrtryMsg {
  public static final String SERIALIZED_NAME_GRP_HDR = "GrpHdr";
  @JsonProperty(SERIALIZED_NAME_GRP_HDR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGrpHdr grpHdr;

  public static final String SERIALIZED_NAME_GET_INFO = "GetInfo";
  @JsonProperty(SERIALIZED_NAME_GET_INFO)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfo getInfo;

  public ConsultaDocumentPrtryMsg() {
  }

  public ConsultaDocumentPrtryMsg grpHdr(@Nonnull ConsultaDocumentPrtryMsgGrpHdr grpHdr) {
    this.grpHdr = grpHdr;
    return this;
  }

  /**
   * Get grpHdr
   * @return grpHdr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdr getGrpHdr() {
    return grpHdr;
  }

  public void setGrpHdr(@Nonnull ConsultaDocumentPrtryMsgGrpHdr grpHdr) {
    this.grpHdr = grpHdr;
  }


  public ConsultaDocumentPrtryMsg getInfo(@Nonnull ConsultaDocumentPrtryMsgGetInfo getInfo) {
    this.getInfo = getInfo;
    return this;
  }

  /**
   * Get getInfo
   * @return getInfo
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfo getGetInfo() {
    return getInfo;
  }

  public void setGetInfo(@Nonnull ConsultaDocumentPrtryMsgGetInfo getInfo) {
    this.getInfo = getInfo;
  }
}

