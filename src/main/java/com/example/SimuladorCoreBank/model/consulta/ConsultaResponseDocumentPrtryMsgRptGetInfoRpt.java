
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;







/**
 * ConsultaResponseDocumentPrtryMsgRptGetInfoRpt
 */

public class ConsultaResponseDocumentPrtryMsgRptGetInfoRpt {
  public static final String SERIALIZED_NAME_ORGNL_GRP_INF = "OrgnlGrpInf";
  @JsonProperty(SERIALIZED_NAME_ORGNL_GRP_INF)
  @Nonnull

  private ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf orgnlGrpInf;

  public static final String SERIALIZED_NAME_ORGNL_END_TO_END_ID = "OrgnlEndToEndId";
  @JsonProperty(SERIALIZED_NAME_ORGNL_END_TO_END_ID)
  @Nonnull

  private String orgnlEndToEndId;

  public static final String SERIALIZED_NAME_ORGNL_TX_ID = "OrgnlTxId";
  @JsonProperty(SERIALIZED_NAME_ORGNL_TX_ID)
  @Nonnull

  private String orgnlTxId;

  public static final String SERIALIZED_NAME_TX_STS = "TxSts";
  @JsonProperty(SERIALIZED_NAME_TX_STS)
  @Nonnull

  private String txSts;

  public static final String SERIALIZED_NAME_STS_RSN_INF = "StsRsnInf";
  @JsonProperty(SERIALIZED_NAME_STS_RSN_INF)
  @Nonnull

  private ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf stsRsnInf;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @JsonProperty(SERIALIZED_NAME_ALIAS)
  @Nonnull

  private String alias;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @JsonProperty(SERIALIZED_NAME_VALUE)
  @Nonnull

  private String value;

  public static final String SERIALIZED_NAME_NM = "Nm";
  @JsonProperty(SERIALIZED_NAME_NM)
  @Nonnull

  private String nm;

  public static final String SERIALIZED_NAME_ID = "Id";
  @JsonProperty(SERIALIZED_NAME_ID)
  @Nonnull

  private String id;

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt() {
  }

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt orgnlGrpInf(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf orgnlGrpInf) {
    this.orgnlGrpInf = orgnlGrpInf;
    return this;
  }

  /**
   * Get orgnlGrpInf
   * @return orgnlGrpInf
   */
  @Nonnull
  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf getOrgnlGrpInf() {
    return orgnlGrpInf;
  }

  public void setOrgnlGrpInf(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf orgnlGrpInf) {
    this.orgnlGrpInf = orgnlGrpInf;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt orgnlEndToEndId(@Nonnull String orgnlEndToEndId) {
    this.orgnlEndToEndId = orgnlEndToEndId;
    return this;
  }

  /**
   * Get orgnlEndToEndId
   * @return orgnlEndToEndId
   */
  @Nonnull
  public String getOrgnlEndToEndId() {
    return orgnlEndToEndId;
  }

  public void setOrgnlEndToEndId(@Nonnull String orgnlEndToEndId) {
    this.orgnlEndToEndId = orgnlEndToEndId;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt orgnlTxId(@Nonnull String orgnlTxId) {
    this.orgnlTxId = orgnlTxId;
    return this;
  }

  /**
   * Get orgnlTxId
   * @return orgnlTxId
   */
  @Nonnull
  public String getOrgnlTxId() {
    return orgnlTxId;
  }

  public void setOrgnlTxId(@Nonnull String orgnlTxId) {
    this.orgnlTxId = orgnlTxId;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt txSts(@Nonnull String txSts) {
    this.txSts = txSts;
    return this;
  }

  /**
   * Get txSts
   * @return txSts
   */
  @Nonnull
  public String getTxSts() {
    return txSts;
  }

  public void setTxSts(@Nonnull String txSts) {
    this.txSts = txSts;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt stsRsnInf(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf stsRsnInf) {
    this.stsRsnInf = stsRsnInf;
    return this;
  }

  /**
   * Get stsRsnInf
   * @return stsRsnInf
   */
  @Nonnull
  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf getStsRsnInf() {
    return stsRsnInf;
  }

  public void setStsRsnInf(@Nonnull ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf stsRsnInf) {
    this.stsRsnInf = stsRsnInf;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt alias(@Nonnull String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Get alias
   * @return alias
   */
  @Nonnull
  public String getAlias() {
    return alias;
  }

  public void setAlias(@Nonnull String alias) {
    this.alias = alias;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt value(@Nonnull String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(@Nonnull String value) {
    this.value = value;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt nm(@Nonnull String nm) {
    this.nm = nm;
    return this;
  }

  /**
   * Get nm
   * @return nm
   */
  @Nonnull
  public String getNm() {
    return nm;
  }

  public void setNm(@Nonnull String nm) {
    this.nm = nm;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRpt id(@Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nonnull
  public String getId() {
    return id;
  }

  public void setId(@Nonnull String id) {
    this.id = id;
  }
}

