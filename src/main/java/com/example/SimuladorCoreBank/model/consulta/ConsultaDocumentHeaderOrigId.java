package com.example.SimuladorCoreBank.model.consulta;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;






/**
 * ConsultaDocumentHeaderOrigId
 */

public class ConsultaDocumentHeaderOrigId {
  public static final String SERIALIZED_NAME_CHANNEL = "Channel";
  @JsonProperty(SERIALIZED_NAME_CHANNEL)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String channel;

  public static final String SERIALIZED_NAME_APP = "App";
  @JsonProperty(SERIALIZED_NAME_APP)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String app;

  public static final String SERIALIZED_NAME_SERVICE = "Service";
  @JsonProperty(SERIALIZED_NAME_SERVICE)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentHeaderOrigIdService service;

  public static final String SERIALIZED_NAME_OTHER_ID = "OtherId";
  @JsonProperty(SERIALIZED_NAME_OTHER_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String otherId;

  public ConsultaDocumentHeaderOrigId() {
  }

  public ConsultaDocumentHeaderOrigId channel(@Nonnull String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
   */
  @Nonnull
  public String getChannel() {
    return channel;
  }

  public void setChannel(@Nonnull String channel) {
    this.channel = channel;
  }


  public ConsultaDocumentHeaderOrigId app(@Nonnull String app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
   */
  @Nonnull
  public String getApp() {
    return app;
  }

  public void setApp(@Nonnull String app) {
    this.app = app;
  }


  public ConsultaDocumentHeaderOrigId service(@Nonnull ConsultaDocumentHeaderOrigIdService service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @Nonnull
  public ConsultaDocumentHeaderOrigIdService getService() {
    return service;
  }

  public void setService(@Nonnull ConsultaDocumentHeaderOrigIdService service) {
    this.service = service;
  }


  public ConsultaDocumentHeaderOrigId otherId(@Nonnull String otherId) {
    this.otherId = otherId;
    return this;
  }

  /**
   * Get otherId
   * @return otherId
   */
  @Nonnull
  public String getOtherId() {
    return otherId;
  }

  public void setOtherId(@Nonnull String otherId) {
    this.otherId = otherId;
  }
}

