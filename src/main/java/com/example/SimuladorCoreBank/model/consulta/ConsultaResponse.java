
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;

public class ConsultaResponse {
  public static final String SERIALIZED_NAME_DOCUMENT = "Document";
  @JsonProperty(SERIALIZED_NAME_DOCUMENT)
  @Nonnull

  private ConsultaResponseDocument document;

  public ConsultaResponse() {
  }

  public ConsultaResponse document(@Nonnull ConsultaResponseDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   */
  @Nonnull
  public ConsultaResponseDocument getDocument() {
    return document;
  }

  public void setDocument(@Nonnull ConsultaResponseDocument document) {
    this.document = document;
  }
}

