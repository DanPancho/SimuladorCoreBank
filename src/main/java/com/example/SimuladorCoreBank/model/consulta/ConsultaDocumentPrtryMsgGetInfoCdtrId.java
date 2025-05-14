
package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class ConsultaDocumentPrtryMsgGetInfoCdtrId {
  public static final String SERIALIZED_NAME_ORG_ID = "OrgId";
  @JsonProperty(SERIALIZED_NAME_ORG_ID)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  @Valid
  private ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId orgId;

  public ConsultaDocumentPrtryMsgGetInfoCdtrId() {
  }

  public ConsultaDocumentPrtryMsgGetInfoCdtrId orgId(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Get orgId
   * @return orgId
   */
  @Nonnull
  public ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId getOrgId() {
    return orgId;
  }

  public void setOrgId(@Nonnull ConsultaDocumentPrtryMsgGetInfoCdtrIdOrgId orgId) {
    this.orgId = orgId;
  }
}

