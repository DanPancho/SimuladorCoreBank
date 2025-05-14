package com.example.SimuladorCoreBank.model.consulta;


import com.fasterxml.jackson.annotation.JsonProperty;



import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotNull;







/**
 * ConsultaDocumentHeaderOrigIdService
 */

public class ConsultaDocumentHeaderOrigIdService {
  public static final String SERIALIZED_NAME_ID_SERV = "IdServ";
  @JsonProperty(SERIALIZED_NAME_ID_SERV)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String idServ;

  public static final String SERIALIZED_NAME_VERS_SERV = "VersServ";
  @JsonProperty(SERIALIZED_NAME_VERS_SERV)
  @Nonnull
  @NotNull(message = "REQUEST NO VALIDO, FALTAN CAMPOS MANDATORIOS")
  private String versServ;

  public ConsultaDocumentHeaderOrigIdService() {
  }

  public ConsultaDocumentHeaderOrigIdService idServ(@Nonnull String idServ) {
    this.idServ = idServ;
    return this;
  }

  /**
   * Get idServ
   * @return idServ
   */
  @Nonnull
  public String getIdServ() {
    return idServ;
  }

  public void setIdServ(@Nonnull String idServ) {
    this.idServ = idServ;
  }


  public ConsultaDocumentHeaderOrigIdService versServ(@Nonnull String versServ) {
    this.versServ = versServ;
    return this;
  }

  /**
   * Get versServ
   * @return versServ
   */
  @Nonnull
  public String getVersServ() {
    return versServ;
  }

  public void setVersServ(@Nonnull String versServ) {
    this.versServ = versServ;
  }
}

