package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


public class ConsultaDocument {
  public static final String SERIALIZED_NAME_HEADER = "Header";
  @JsonProperty(SERIALIZED_NAME_HEADER)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentHeader header;
  


  public static final String SERIALIZED_NAME_PRTRY_MSG = "PrtryMsg";
  @JsonProperty(SERIALIZED_NAME_PRTRY_MSG)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsg prtryMsg;
  

  
  public ConsultaDocument() {
  }

  public ConsultaDocument header(@Nonnull ConsultaDocumentHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   */
  @Nonnull
  public ConsultaDocumentHeader getHeader() {
    return header;
  }

  public void setHeader(@Nonnull ConsultaDocumentHeader header) {
    this.header = header;
  }


  public ConsultaDocument prtryMsg(@Nonnull ConsultaDocumentPrtryMsg prtryMsg) {
    this.prtryMsg = prtryMsg;
    return this;
  }


  @Nonnull
  public ConsultaDocumentPrtryMsg getPrtryMsg() {
    return prtryMsg;
  }

  public void setPrtryMsg(@Nonnull ConsultaDocumentPrtryMsg prtryMsg) {
    this.prtryMsg = prtryMsg;
  }
}

