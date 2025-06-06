/*
 * Credito Core Banking | Servicio Pago Directo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.SimuladorCoreBank.model.credito;

import jakarta.annotation.Nonnull;

import com.fasterxml.jackson.annotation.JsonProperty;




/**
 * CreditoResponseDocumentFIToFIPmtStsRptGrpHdr
 */

public class CreditoResponseDocumentFIToFIPmtStsRptGrpHdr {
  public static final String SERIALIZED_NAME_MSG_ID = "MsgId";
  @JsonProperty(SERIALIZED_NAME_MSG_ID)
  @Nonnull
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
  private CreditoResponseDocumentFIToFIPmtStsRptGrpHdrSttInf sttInf;

  public static final String SERIALIZED_NAME_INSTG_AGT = "InstgAgt";
  @JsonProperty(SERIALIZED_NAME_INSTG_AGT)
  @Nonnull
  private CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgt instgAgt;

  public static final String SERIALIZED_NAME_INSTD_AGT = "InstdAgt";
  @JsonProperty(SERIALIZED_NAME_INSTD_AGT)
  @Nonnull
  private CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgt instdAgt;

  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdr() {
  }

  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdr msgId(@Nonnull String msgId) {
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


  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdr creDtTm(@Nonnull String creDtTm) {
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


  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdr nbOfTxs(@Nonnull String nbOfTxs) {
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


  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdr sttInf(@Nonnull CreditoResponseDocumentFIToFIPmtStsRptGrpHdrSttInf sttInf) {
    this.sttInf = sttInf;
    return this;
  }

  /**
   * Get sttInf
   * @return sttInf
   */
  @Nonnull
  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdrSttInf getSttInf() {
    return sttInf;
  }

  public void setSttInf(@Nonnull CreditoResponseDocumentFIToFIPmtStsRptGrpHdrSttInf sttInf) {
    this.sttInf = sttInf;
  }


  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdr instgAgt(@Nonnull CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgt instgAgt) {
    this.instgAgt = instgAgt;
    return this;
  }

  /**
   * Get instgAgt
   * @return instgAgt
   */
  @Nonnull
  public CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgt getInstgAgt() {
    return instgAgt;
  }

  public void setInstgAgt(@Nonnull CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgt instgAgt) {
    this.instgAgt = instgAgt;
  }


  public CreditoResponseDocumentFIToFIPmtStsRptGrpHdr instdAgt(@Nonnull CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgt instdAgt) {
    this.instdAgt = instdAgt;
    return this;
  }

  /**
   * Get instdAgt
   * @return instdAgt
   */
  @Nonnull
  public CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgt getInstdAgt() {
    return instdAgt;
  }

  public void setInstdAgt(@Nonnull CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgt instdAgt) {
    this.instdAgt = instdAgt;
  }
}

