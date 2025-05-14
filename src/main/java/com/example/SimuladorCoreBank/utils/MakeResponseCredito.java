package com.example.SimuladorCoreBank.utils;

import com.example.SimuladorCoreBank.model.credito.CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgt;
import com.example.SimuladorCoreBank.model.credito.CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgtFinInstnId;
import com.example.SimuladorCoreBank.model.credito.CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.credito.CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgt;
import com.example.SimuladorCoreBank.model.credito.CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgtFinInstnId;
import com.example.SimuladorCoreBank.model.credito.CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgtFinInstnIdOthr;
import com.example.SimuladorCoreBank.model.credito.CreditoRequestDocumentHeaderOrigIdService;
import com.example.SimuladorCoreBank.model.credito.CreditoResponse;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocument;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRpt;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptGrpHdr;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptGrpHdrSttInf;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptTxInfAndSts;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsOrgnlGrpInf;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsSplmtryData;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsSplmtryDataEnvlp;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsStsRsnInf;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsStsRsnInfRsn;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentHeader;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentHeaderMge;
import com.example.SimuladorCoreBank.model.credito.CreditoResponseDocumentHeaderOrigId;

public class MakeResponseCredito {

    public static CreditoResponse makeResponse(CreditoResponse creditoResponse) {
        
        creditoResponse.setDocument(new CreditoResponseDocument());

        // Header
        CreditoResponseDocumentHeader header = new CreditoResponseDocumentHeader();
        header.setOrigId(new CreditoResponseDocumentHeaderOrigId());
        header.getOrigId().setService(new CreditoRequestDocumentHeaderOrigIdService());
        header.setMge(new CreditoResponseDocumentHeaderMge());
        creditoResponse.getDocument().setHeader(header);

        // FIToFIPmtStsRpt
        CreditoResponseDocumentFIToFIPmtStsRpt rpt = new CreditoResponseDocumentFIToFIPmtStsRpt();
        rpt.setGrpHdr(new CreditoResponseDocumentFIToFIPmtStsRptGrpHdr());
        rpt.getGrpHdr().setSttInf(new CreditoResponseDocumentFIToFIPmtStsRptGrpHdrSttInf());

        rpt.getGrpHdr().setInstgAgt(new CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgt());
        rpt.getGrpHdr().getInstgAgt().setFinInstnId(new CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgtFinInstnId());
        rpt.getGrpHdr().getInstgAgt().getFinInstnId().setOthr(new CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstgAgtFinInstnIdOthr());

        rpt.getGrpHdr().setInstdAgt(new CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgt());
        rpt.getGrpHdr().getInstdAgt().setFinInstnId(new CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgtFinInstnId());
        rpt.getGrpHdr().getInstdAgt().getFinInstnId().setOthr(new CreditoRequestDocumentFIToFICstmrCdtTrfGrpHdrInstdAgtFinInstnIdOthr());

        rpt.setTxInfAndSts(new CreditoResponseDocumentFIToFIPmtStsRptTxInfAndSts());
        rpt.getTxInfAndSts().setOrgnlGrpInf(new CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsOrgnlGrpInf());
        rpt.getTxInfAndSts().setStsRsnInf(new CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsStsRsnInf());
        rpt.getTxInfAndSts().getStsRsnInf().setRsn(new CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsStsRsnInfRsn());

        rpt.getTxInfAndSts().setSplmtryData(new CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsSplmtryData());
        rpt.getTxInfAndSts().getSplmtryData().setEnvlp(new CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsSplmtryDataEnvlp());
        rpt.getTxInfAndSts().getSplmtryData().getEnvlp().setCnts(new CreditoResponseDocumentFIToFIPmtStsRptTxInfAndStsSplmtryDataEnvlpCnts());

        creditoResponse.getDocument().setFiToFIPmtStsRpt(rpt);

        return creditoResponse;
    }
}
