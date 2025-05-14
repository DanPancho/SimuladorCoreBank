
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;

import jakarta.validation.constraints.NotNull;


public class ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts {
  public static final String SERIALIZED_NAME_CUST_REF = "CustRef";
  @JsonProperty(SERIALIZED_NAME_CUST_REF)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String custRef;

  public static final String SERIALIZED_NAME_ABA_NB = "AbaNb";
  @JsonProperty(SERIALIZED_NAME_ABA_NB)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String abaNb;

  public static final String SERIALIZED_NAME_TRACK2 = "Track2";
  @JsonProperty(SERIALIZED_NAME_TRACK2)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String track2;

  public static final String SERIALIZED_NAME_CITY_REF = "CityRef";
  @JsonProperty(SERIALIZED_NAME_CITY_REF)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String cityRef;

  public static final String SERIALIZED_NAME_STTLM_DT = "SttlmDt";
  @JsonProperty(SERIALIZED_NAME_STTLM_DT)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String sttlmDt;

  public static final String SERIALIZED_NAME_ADITIONAL_DATA = "AditionalData";
  @JsonProperty(SERIALIZED_NAME_ADITIONAL_DATA)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String aditionalData;

  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts() {
  }

  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts custRef(@Nonnull String custRef) {
    this.custRef = custRef;
    return this;
  }

  /**
   * Get custRef
   * @return custRef
   */
  @Nonnull
  public String getCustRef() {
    return custRef;
  }

  public void setCustRef(@Nonnull String custRef) {
    this.custRef = custRef;
  }


  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts abaNb(@Nonnull String abaNb) {
    this.abaNb = abaNb;
    return this;
  }

  /**
   * Get abaNb
   * @return abaNb
   */
  @Nonnull
  public String getAbaNb() {
    return abaNb;
  }

  public void setAbaNb(@Nonnull String abaNb) {
    this.abaNb = abaNb;
  }


  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts track2(@Nonnull String track2) {
    this.track2 = track2;
    return this;
  }

  /**
   * Get track2
   * @return track2
   */
  @Nonnull
  public String getTrack2() {
    return track2;
  }

  public void setTrack2(@Nonnull String track2) {
    this.track2 = track2;
  }


  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts cityRef(@Nonnull String cityRef) {
    this.cityRef = cityRef;
    return this;
  }

  /**
   * Get cityRef
   * @return cityRef
   */
  @Nonnull
  public String getCityRef() {
    return cityRef;
  }

  public void setCityRef(@Nonnull String cityRef) {
    this.cityRef = cityRef;
  }


  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts sttlmDt(@Nonnull String sttlmDt) {
    this.sttlmDt = sttlmDt;
    return this;
  }

  /**
   * Get sttlmDt
   * @return sttlmDt
   */
  @Nonnull
  public String getSttlmDt() {
    return sttlmDt;
  }

  public void setSttlmDt(@Nonnull String sttlmDt) {
    this.sttlmDt = sttlmDt;
  }


  public ConsultaDocumentPrtryMsgGetInfoSplmtryDataEnvlpCnts aditionalData(@Nonnull String aditionalData) {
    this.aditionalData = aditionalData;
    return this;
  }

  /**
   * Get aditionalData
   * @return aditionalData
   */
  @Nonnull
  public String getAditionalData() {
    return aditionalData;
  }

  public void setAditionalData(@Nonnull String aditionalData) {
    this.aditionalData = aditionalData;
  }
}

