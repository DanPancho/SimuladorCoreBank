
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentPrtryMsgGetInfo
 */

public class ConsultaDocumentPrtryMsgGetInfo {
  public static final String SERIALIZED_NAME_END_TO_END_ID = "EndToEndId";
  @JsonProperty(SERIALIZED_NAME_END_TO_END_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String endToEndId;

  public static final String SERIALIZED_NAME_TX_ID = "TxId";
  @JsonProperty(SERIALIZED_NAME_TX_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String txId;

  public static final String SERIALIZED_NAME_DBTR = "Dbtr";
  @JsonProperty(SERIALIZED_NAME_DBTR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoDbtr dbtr;

  public static final String SERIALIZED_NAME_CDTR = "Cdtr";
  @JsonProperty(SERIALIZED_NAME_CDTR)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoCdtr cdtr;

  public static final String SERIALIZED_NAME_CDTR_ACCT = "CdtrAcct";
  @JsonProperty(SERIALIZED_NAME_CDTR_ACCT)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoCdtrAcct cdtrAcct;

  public static final String SERIALIZED_NAME_SPLMTRY_DATA = "SplmtryData";
  @JsonProperty(SERIALIZED_NAME_SPLMTRY_DATA)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoSplmtryData splmtryData;

  public ConsultaDocumentPrtryMsgGetInfo() {
  }

  public ConsultaDocumentPrtryMsgGetInfo endToEndId(@Nonnull String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  /**
   * Get endToEndId
   * @return endToEndId
   */
  @Nonnull
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(@Nonnull String endToEndId) {
    this.endToEndId = endToEndId;
  }


  public ConsultaDocumentPrtryMsgGetInfo txId(@Nonnull String txId) {
    this.txId = txId;
    return this;
  }

  /**
   * Get txId
   * @return txId
   */
  @Nonnull
  public String getTxId() {
    return txId;
  }

  public void setTxId(@Nonnull String txId) {
    this.txId = txId;
  }


  public ConsultaDocumentPrtryMsgGetInfo dbtr(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtr dbtr) {
    this.dbtr = dbtr;
    return this;
  }

  /**
   * Get dbtr
   * @return dbtr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoDbtr getDbtr() {
    return dbtr;
  }

  public void setDbtr(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtr dbtr) {
    this.dbtr = dbtr;
  }


  public ConsultaDocumentPrtryMsgGetInfo cdtr(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtr cdtr) {
    this.cdtr = cdtr;
    return this;
  }

  /**
   * Get cdtr
   * @return cdtr
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoCdtr getCdtr() {
    return cdtr;
  }

  public void setCdtr(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtr cdtr) {
    this.cdtr = cdtr;
  }


  public ConsultaDocumentPrtryMsgGetInfo cdtrAcct(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrAcct cdtrAcct) {
    this.cdtrAcct = cdtrAcct;
    return this;
  }

  /**
   * Get cdtrAcct
   * @return cdtrAcct
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoCdtrAcct getCdtrAcct() {
    return cdtrAcct;
  }

  public void setCdtrAcct(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrAcct cdtrAcct) {
    this.cdtrAcct = cdtrAcct;
  }


  public ConsultaDocumentPrtryMsgGetInfo splmtryData(@Nonnull ConsultaDocumentPrtryMsgGetInfoSplmtryData splmtryData) {
    this.splmtryData = splmtryData;
    return this;
  }

  /**
   * Get splmtryData
   * @return splmtryData
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoSplmtryData getSplmtryData() {
    return splmtryData;
  }

  public void setSplmtryData(@Nonnull ConsultaDocumentPrtryMsgGetInfoSplmtryData splmtryData) {
    this.splmtryData = splmtryData;
  }
}

