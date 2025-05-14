package com.example.SimuladorCoreBank.utils;

import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentHeader;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentHeaderMge;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentHeaderOrigId;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentHeaderOrigIdService;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdr;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdrInstdAgt;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdrInstgAgt;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnId;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.consulta.ConsultaDocumentPrtryMsgGrpHdrSttInf;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponse;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponseDocument;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponseDocumentPrtryMsgRpt;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponseDocumentPrtryMsgRptGetInfoRpt;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf;
import com.example.SimuladorCoreBank.model.consulta.ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn;

public class MakeResponseConsulta {
    public static ConsultaResponse makeResponseConsulta(ConsultaResponse consultaResponse){
        // HEADER
        consultaResponse.setDocument(new ConsultaResponseDocument());
        consultaResponse.getDocument().setHeader(new ConsultaDocumentHeader());
        consultaResponse.getDocument().getHeader().setOrigId(new ConsultaDocumentHeaderOrigId());
        consultaResponse.getDocument().getHeader().getOrigId().setService(new ConsultaDocumentHeaderOrigIdService());
        consultaResponse.getDocument().getHeader().setMge(new ConsultaDocumentHeaderMge());

        // GROUP HEADER
        consultaResponse.getDocument().setPrtryMsgRpt(new ConsultaResponseDocumentPrtryMsgRpt());
        consultaResponse.getDocument().getPrtryMsgRpt().setGrpHdr(new ConsultaDocumentPrtryMsgGrpHdr());
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().setSttInf(new ConsultaDocumentPrtryMsgGrpHdrSttInf());
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().setInstgAgt(new ConsultaDocumentPrtryMsgGrpHdrInstgAgt());
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().getInstgAgt().setFinInstnId(new ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnId());
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().getInstgAgt().getFinInstnId().setOthr(new ConsultaDocumentPrtryMsgGrpHdrInstgAgtFinInstnIdOthr());

        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().setInstdAgt(new ConsultaDocumentPrtryMsgGrpHdrInstdAgt());
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().getInstdAgt().setFinInstnId(new ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnId());
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().getInstdAgt().getFinInstnId().setOthr(new ConsultaDocumentPrtryMsgGrpHdrInstdAgtFinInstnIdOthr());

        consultaResponse.getDocument().getPrtryMsgRpt().setGetInfoRpt(new ConsultaResponseDocumentPrtryMsgRptGetInfoRpt());
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setOrgnlGrpInf(new ConsultaResponseDocumentPrtryMsgRptGetInfoRptOrgnlGrpInf());
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().stsRsnInf(new ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInf());
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().getStsRsnInf().setRsn(new ConsultaResponseDocumentPrtryMsgRptGetInfoRptStsRsnInfRsn());
        return null;
    }
}
