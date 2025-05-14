
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotNull;


public class ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr {
  public static final String SERIALIZED_NAME_ID = "Id";
  @JsonProperty(SERIALIZED_NAME_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String id;

  public ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr() {
  }

  public ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr id(@Nonnull String id) {
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

