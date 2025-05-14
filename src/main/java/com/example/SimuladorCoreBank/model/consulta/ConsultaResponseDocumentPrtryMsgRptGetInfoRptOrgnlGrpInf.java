
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;







/**
 * ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf
 */

public class ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf {
  public static final String SERIALIZED_NAME_ORGNL_MSG_ID = "OrgnlMsgId";
  @JsonProperty(SERIALIZED_NAME_ORGNL_MSG_ID)
  @Nonnull

  private String orgnlMsgId;

  public static final String SERIALIZED_NAME_ORGNL_MSG_NM_ID = "OrgnlMsgNmId";
  @JsonProperty(SERIALIZED_NAME_ORGNL_MSG_NM_ID)
  @Nonnull

  private String orgnlMsgNmId;

  public static final String SERIALIZED_NAME_ORGNL_CRE_DT_TM = "OrgnlCreDtTm";
  @JsonProperty(SERIALIZED_NAME_ORGNL_CRE_DT_TM)
  @Nonnull

  private String orgnlCreDtTm;

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf() {
  }

  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf orgnlMsgId(@Nonnull String orgnlMsgId) {
    this.orgnlMsgId = orgnlMsgId;
    return this;
  }

  /**
   * Get orgnlMsgId
   * @return orgnlMsgId
   */
  @Nonnull
  public String getOrgnlMsgId() {
    return orgnlMsgId;
  }

  public void setOrgnlMsgId(@Nonnull String orgnlMsgId) {
    this.orgnlMsgId = orgnlMsgId;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf orgnlMsgNmId(@Nonnull String orgnlMsgNmId) {
    this.orgnlMsgNmId = orgnlMsgNmId;
    return this;
  }

  /**
   * Get orgnlMsgNmId
   * @return orgnlMsgNmId
   */
  @Nonnull
  public String getOrgnlMsgNmId() {
    return orgnlMsgNmId;
  }

  public void setOrgnlMsgNmId(@Nonnull String orgnlMsgNmId) {
    this.orgnlMsgNmId = orgnlMsgNmId;
  }


  public ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf orgnlCreDtTm(@Nonnull String orgnlCreDtTm) {
    this.orgnlCreDtTm = orgnlCreDtTm;
    return this;
  }

  /**
   * Get orgnlCreDtTm
   * @return orgnlCreDtTm
   */
  @Nonnull
  public String getOrgnlCreDtTm() {
    return orgnlCreDtTm;
  }

  public void setOrgnlCreDtTm(@Nonnull String orgnlCreDtTm) {
    this.orgnlCreDtTm = orgnlCreDtTm;
  }
}

