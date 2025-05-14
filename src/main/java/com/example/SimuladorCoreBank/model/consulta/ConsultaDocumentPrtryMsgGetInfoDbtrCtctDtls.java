
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotNull;

public class ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls {
  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @JsonProperty(SERIALIZED_NAME_ALIAS)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String alias;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @JsonProperty(SERIALIZED_NAME_VALUE)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String value;

  public ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls() {
  }

  public ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls alias(@Nonnull String alias) {
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


  public ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls value(@Nonnull String value) {
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
}

