package com.example.SimuladorCoreBank.utils;

import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentFIToFICstmrDbtTrfCdtTrfTxInfDbtrAgt;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentFIToFICstmrDbtTrfCdtTrfTxInfDbtrAgtFinInstnId;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentFIToFICstmrDbtTrfCdtTrfTxInfDbtrAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgt;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnId;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrSttInf;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentHeaderOrigId;
import com.example.SimuladorCoreBank.model.debito.DebitoRequestDocumentHeaderOrigIdService;
import com.example.SimuladorCoreBank.model.debito.DebitoResponse;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocument;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRpt;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptGrpHdr;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndSts;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsOrgnlGrpInf;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryData;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlp;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInf;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentHeader;
import com.example.SimuladorCoreBank.model.debito.DebitoResponseDocumentHeaderMge;

public class MakeResponseDebito {

    public static DebitoResponse makDebitoResponse(DebitoResponse debitoResponse) {

        debitoResponse.setDocument(new DebitoResponseDocument());
        debitoResponse.getDocument().setHeader(new DebitoResponseDocumentHeader());
        debitoResponse.getDocument().getHeader().setOrigId(new DebitoRequestDocumentHeaderOrigId());
        debitoResponse.getDocument().getHeader().getOrigId().setService(new DebitoRequestDocumentHeaderOrigIdService());
        debitoResponse.getDocument().getHeader().setMge(new DebitoResponseDocumentHeaderMge());

        debitoResponse.getDocument().setFiToFIDbtPmtStsRpt(new DebitoResponseDocumentFIToFIDbtPmtStsRpt());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().setGrpHdr(new DebitoResponseDocumentFIToFIDbtPmtStsRptGrpHdr());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setSttInf(new DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrSttInf());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setInstgAgt(new DebitoRequestDocumentFIToFICstmrDbtTrfCdtTrfTxInfDbtrAgt());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstgAgt().setFinInstnId(new DebitoRequestDocumentFIToFICstmrDbtTrfCdtTrfTxInfDbtrAgtFinInstnId());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstgAgt().getFinInstnId().setOthr(new DebitoRequestDocumentFIToFICstmrDbtTrfCdtTrfTxInfDbtrAgtFinInstnIdOthr());

        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setInstdAgt(new DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgt());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstdAgt().setFinInstnId(new DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnId());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstdAgt().getFinInstnId().setOthr(new DebitoRequestDocumentFIToFICstmrDbtTrfGrpHdrInstdAgtFinInstnIdOthr());

        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().setTxInfAndSts(new DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndSts());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setOrgnlGrpInf(new DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsOrgnlGrpInf());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setStsRsnInf(new DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInf());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getStsRsnInf().setRsn(new DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsStsRsnInfRsn());

        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setSplmtryData(new DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryData());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getSplmtryData().setEnvlp(new DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlp());
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getSplmtryData().getEnvlp().setCnts(new DebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts());

        return debitoResponse;
    }
}
