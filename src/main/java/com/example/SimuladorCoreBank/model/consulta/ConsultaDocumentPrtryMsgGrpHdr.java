
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


public class ConsultaDocumentPrtryMsgGrpHdr {
  public static final String SERIALIZED_NAME_MSG_ID = "MsgId";
  @JsonProperty(SERIALIZED_NAME_MSG_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String msgId;

  public static final String SERIALIZED_NAME_CRE_DT_TM = "CreDtTm";
  @JsonProperty(SERIALIZED_NAME_CRE_DT_TM)
  @Nonnull
  private String creDtTm;

  public static final String SERIALIZED_NAME_NB_OF_TXS = "NbOfTxs";
  @JsonProperty(SERIALIZED_NAME_NB_OF_TXS)
  @Nonnull
  private String nbOfTxs;

  public static final String SERIALIZED_NAME_STT_INF = "SttInf";
  @JsonProperty(SERIALIZED_NAME_STT_INF)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGrpHdrSttInf sttInf;

  public static final String SERIALIZED_NAME_INSTG_AGT = "InstgAgt";
  @JsonProperty(SERIALIZED_NAME_INSTG_AGT)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGrpHdrInstgAgt instgAgt;

  public static final String SERIALIZED_NAME_INSTD_AGT = "InstdAgt";
  @JsonProperty(SERIALIZED_NAME_INSTD_AGT)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGrpHdrInstdAgt instdAgt;

  public ConsultaDocumentPrtryMsgGrpHdr() {
  }

  public ConsultaDocumentPrtryMsgGrpHdr msgId(@Nonnull String msgId) {
    this.msgId = msgId;
    return this;
  }

  /**
   * Get msgId
   * @return msgId
   */
  @Nonnull
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(@Nonnull String msgId) {
    this.msgId = msgId;
  }


  public ConsultaDocumentPrtryMsgGrpHdr creDtTm(@Nonnull String creDtTm) {
    this.creDtTm = creDtTm;
    return this;
  }

  /**
   * Get creDtTm
   * @return creDtTm
   */
  @Nonnull
  public String getCreDtTm() {
    return creDtTm;
  }

  public void setCreDtTm(@Nonnull String creDtTm) {
    this.creDtTm = creDtTm;
  }


  public ConsultaDocumentPrtryMsgGrpHdr nbOfTxs(@Nonnull String nbOfTxs) {
    this.nbOfTxs = nbOfTxs;
    return this;
  }

  /**
   * Get nbOfTxs
   * @return nbOfTxs
   */
  @Nonnull
  public String getNbOfTxs() {
    return nbOfTxs;
  }

  public void setNbOfTxs(@Nonnull String nbOfTxs) {
    this.nbOfTxs = nbOfTxs;
  }


  public ConsultaDocumentPrtryMsgGrpHdr sttInf(@Nonnull ConsultaDocumentPrtryMsgGrpHdrSttInf sttInf) {
    this.sttInf = sttInf;
    return this;
  }

  /**
   * Get sttInf
   * @return sttInf
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdrSttInf getSttInf() {
    return sttInf;
  }

  public void setSttInf(@Nonnull ConsultaDocumentPrtryMsgGrpHdrSttInf sttInf) {
    this.sttInf = sttInf;
  }


  public ConsultaDocumentPrtryMsgGrpHdr instgAgt(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstgAgt instgAgt) {
    this.instgAgt = instgAgt;
    return this;
  }

  /**
   * Get instgAgt
   * @return instgAgt
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdrInstgAgt getInstgAgt() {
    return instgAgt;
  }

  public void setInstgAgt(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstgAgt instgAgt) {
    this.instgAgt = instgAgt;
  }


  public ConsultaDocumentPrtryMsgGrpHdr instdAgt(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstdAgt instdAgt) {
    this.instdAgt = instdAgt;
    return this;
  }

  /**
   * Get instdAgt
   * @return instdAgt
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGrpHdrInstdAgt getInstdAgt() {
    return instdAgt;
  }

  public void setInstdAgt(@Nonnull ConsultaDocumentPrtryMsgGrpHdrInstdAgt instdAgt) {
    this.instdAgt = instdAgt;
  }
}

