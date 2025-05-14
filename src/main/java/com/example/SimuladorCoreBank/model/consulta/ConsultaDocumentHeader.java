package com.example.SimuladorCoreBank.model.consulta;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class ConsultaDocumentHeader {
  public static final String SERIALIZED_NAME_ORIG_ID = "OrigId";
  @JsonProperty(SERIALIZED_NAME_ORIG_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentHeaderOrigId origId;

  public static final String SERIALIZED_NAME_SENDER = "Sender";
  @JsonProperty(SERIALIZED_NAME_SENDER)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String sender;

  public static final String SERIALIZED_NAME_RECEIVER = "Receiver";
  @JsonProperty(SERIALIZED_NAME_RECEIVER)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String receiver;

  public static final String SERIALIZED_NAME_MGE = "Mge";
  @JsonProperty(SERIALIZED_NAME_MGE)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentHeaderMge mge;

  public static final String SERIALIZED_NAME_PSSBL_DPLCT = "PssblDplct";
  @JsonProperty(SERIALIZED_NAME_PSSBL_DPLCT)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String pssblDplct;

  public static final String SERIALIZED_NAME_PRTY = "Prty";
  @JsonProperty(SERIALIZED_NAME_PRTY)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String prty;

  public ConsultaDocumentHeader() {
  }

  public ConsultaDocumentHeader origId(@Nonnull ConsultaDocumentHeaderOrigId origId) {
    this.origId = origId;
    return this;
  }

  /**
   * Get origId
   * @return origId
   */
  @Nonnull
  public ConsultaDocumentHeaderOrigId getOrigId() {
    return origId;
  }

  public void setOrigId(@Nonnull ConsultaDocumentHeaderOrigId origId) {
    this.origId = origId;
  }


  public ConsultaDocumentHeader sender(@Nonnull String sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @Nonnull
  public String getSender() {
    return sender;
  }

  public void setSender(@Nonnull String sender) {
    this.sender = sender;
  }


  public ConsultaDocumentHeader receiver(@Nonnull String receiver) {
    this.receiver = receiver;
    return this;
  }

  /**
   * Get receiver
   * @return receiver
   */
  @Nonnull
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(@Nonnull String receiver) {
    this.receiver = receiver;
  }


  public ConsultaDocumentHeader mge(@Nonnull ConsultaDocumentHeaderMge mge) {
    this.mge = mge;
    return this;
  }

  /**
   * Get mge
   * @return mge
   */
  @Nonnull
  public ConsultaDocumentHeaderMge getMge() {
    return mge;
  }

  public void setMge(@Nonnull ConsultaDocumentHeaderMge mge) {
    this.mge = mge;
  }


  public ConsultaDocumentHeader pssblDplct(@Nonnull String pssblDplct) {
    this.pssblDplct = pssblDplct;
    return this;
  }

  /**
   * Get pssblDplct
   * @return pssblDplct
   */
  @Nonnull
  public String getPssblDplct() {
    return pssblDplct;
  }

  public void setPssblDplct(@Nonnull String pssblDplct) {
    this.pssblDplct = pssblDplct;
  }


  public ConsultaDocumentHeader prty(@Nonnull String prty) {
    this.prty = prty;
    return this;
  }

  /**
   * Get prty
   * @return prty
   */
  @Nonnull
  public String getPrty() {
    return prty;
  }

  public void setPrty(@Nonnull String prty) {
    this.prty = prty;
  }
}

