
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;


import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;





/**
 * ConsultaDocumentPrtryMsgGetInfoDbtr
 */

public class ConsultaDocumentPrtryMsgGetInfoDbtr {
  public static final String SERIALIZED_NAME_NM = "Nm";
  @JsonProperty(SERIALIZED_NAME_NM)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String nm;

  public static final String SERIALIZED_NAME_ID = "Id";
  @JsonProperty(SERIALIZED_NAME_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoDbtrId id;

  public static final String SERIALIZED_NAME_CTCT_DTLS = "CtctDtls";
  @JsonProperty(SERIALIZED_NAME_CTCT_DTLS)
  @Nullable
  private ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls ctctDtls;

  public ConsultaDocumentPrtryMsgGetInfoDbtr() {
  }

  public ConsultaDocumentPrtryMsgGetInfoDbtr nm(@Nonnull String nm) {
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


  public ConsultaDocumentPrtryMsgGetInfoDbtr id(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtrId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoDbtrId getId() {
    return id;
  }

  public void setId(@Nonnull ConsultaDocumentPrtryMsgGetInfoDbtrId id) {
    this.id = id;
  }


  public ConsultaDocumentPrtryMsgGetInfoDbtr ctctDtls(@Nullable ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls ctctDtls) {
    this.ctctDtls = ctctDtls;
    return this;
  }

  /**
   * Get ctctDtls
   * @return ctctDtls
   */
  @Nullable
  public ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls getCtctDtls() {
    return ctctDtls;
  }

  public void setCtctDtls(@Nullable ConsultaDocumentPrtryMsgGetInfoDbtrCtctDtls ctctDtls) {
    this.ctctDtls = ctctDtls;
  }
}

