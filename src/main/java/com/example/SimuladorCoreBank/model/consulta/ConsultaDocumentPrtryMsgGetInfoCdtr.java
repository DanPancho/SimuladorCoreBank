
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;


import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;





/**
 * ConsultaDocumentPrtryMsgGetInfoCdtr
 */

public class ConsultaDocumentPrtryMsgGetInfoCdtr {
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
  private ConsultaDocumentPrtryMsgGetInfoCdtrId id;

  public static final String SERIALIZED_NAME_CTCT_DTLS = "CtctDtls";
  @JsonProperty(SERIALIZED_NAME_CTCT_DTLS)
  @Nullable
  private ConsultaDocumentPrtryMsgGetInfoCdtrCtctDtls ctctDtls;

  public ConsultaDocumentPrtryMsgGetInfoCdtr() {
  }

  public ConsultaDocumentPrtryMsgGetInfoCdtr nm(@Nonnull String nm) {
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


  public ConsultaDocumentPrtryMsgGetInfoCdtr id(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoCdtrId getId() {
    return id;
  }

  public void setId(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrId id) {
    this.id = id;
  }


  public ConsultaDocumentPrtryMsgGetInfoCdtr ctctDtls(@Nullable ConsultaDocumentPrtryMsgGetInfoCdtrCtctDtls ctctDtls) {
    this.ctctDtls = ctctDtls;
    return this;
  }

  /**
   * Get ctctDtls
   * @return ctctDtls
   */
  @Nullable
  public ConsultaDocumentPrtryMsgGetInfoCdtrCtctDtls getCtctDtls() {
    return ctctDtls;
  }

  public void setCtctDtls(@Nullable ConsultaDocumentPrtryMsgGetInfoCdtrCtctDtls ctctDtls) {
    this.ctctDtls = ctctDtls;
  }
}

