package com.example.SimuladorCoreBank.utils;

import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuesta;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstdAgt;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstdAgtFinInstnId;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstdAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstgAgt;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstgAgtFinInstnId;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstgAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrSttInf;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoDocumentHeaderOrigIdService;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponse;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocument;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRpt;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptGrpHdr;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndSts;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsOrgnlGrpInf;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInf;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentHeader;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentHeaderMge;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentHeaderOrigId;

public class MakeResponseRevDebito {

    public static ReversoDebitoResponse makeReversoDebitoResponse(ReversoDebitoResponse reversoDebitoResponse) {

        reversoDebitoResponse.setDocument(new ReversoDebitoResponseDocument());
        reversoDebitoResponse.getDocument().setHeader(new ReversoDebitoResponseDocumentHeader());
        reversoDebitoResponse.getDocument().getHeader().setOrigId(new ReversoDebitoResponseDocumentHeaderOrigId());
        reversoDebitoResponse.getDocument().getHeader().getOrigId().setService(new ReversoDebitoDocumentHeaderOrigIdService());
        reversoDebitoResponse.getDocument().getHeader().setMge(new ReversoDebitoResponseDocumentHeaderMge());
        reversoDebitoResponse.getDocument().setFiToFIDbtPmtStsRpt(new ReversoDebitoResponseDocumentFIToFIDbtPmtStsRpt());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().setGrpHdr(new ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptGrpHdr());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setSttInf(new ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrSttInf());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setInstgAgt(new ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstgAgt());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstgAgt().setFinInstnId(new ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstgAgtFinInstnId());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstgAgt().getFinInstnId().setOthr(new ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstgAgtFinInstnIdOthr());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setInstdAgt(new ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstdAgt());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstdAgt().setFinInstnId(new ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstdAgtFinInstnId());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstdAgt().getFinInstnId().setOthr(new ReversoDebitoDocumentFIToFIDbtPmtRvslGrpHdrInstdAgtFinInstnIdOthr());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().setTxInfAndSts(new ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndSts());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setOrgnlGrpInf(new ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsOrgnlGrpInf());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setStsRsnInf(new ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInf());
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getStsRsnInf().setRsn(new ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn());

        return reversoDebitoResponse;
    }

}
