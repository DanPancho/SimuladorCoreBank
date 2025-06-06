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
 * CreditoResponseDocumentHeaderOrigId
 */

public class CreditoResponseDocumentHeaderOrigId {
  public static final String SERIALIZED_NAME_CHANNEL = "Channel";
  @JsonProperty(SERIALIZED_NAME_CHANNEL)
  @Nonnull
  private String channel;

  public static final String SERIALIZED_NAME_APP = "App";
  @JsonProperty(SERIALIZED_NAME_APP)
  @Nonnull
  private String app;

  public static final String SERIALIZED_NAME_SERVICE = "Service";
  @JsonProperty(SERIALIZED_NAME_SERVICE)
  @Nonnull
  private CreditoRequestDocumentHeaderOrigIdService service;

  public static final String SERIALIZED_NAME_OTHER_ID = "OtherId";
  @JsonProperty(SERIALIZED_NAME_OTHER_ID)
  @Nonnull
  private String otherId;

  public CreditoResponseDocumentHeaderOrigId() {
  }

  public CreditoResponseDocumentHeaderOrigId channel(@Nonnull String channel) {
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


  public CreditoResponseDocumentHeaderOrigId app(@Nonnull String app) {
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


  public CreditoResponseDocumentHeaderOrigId service(@Nonnull CreditoRequestDocumentHeaderOrigIdService service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @Nonnull
  public CreditoRequestDocumentHeaderOrigIdService getService() {
    return service;
  }

  public void setService(@Nonnull CreditoRequestDocumentHeaderOrigIdService service) {
    this.service = service;
  }


  public CreditoResponseDocumentHeaderOrigId otherId(@Nonnull String otherId) {
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

