package com.example.SimuladorCoreBank.service.impl;

import org.springframework.stereotype.Service;

import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponse;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndSts;
import com.example.SimuladorCoreBank.model.reversoDebito.ReversoDebitoResponseDocumentFIToFIDbtPmtStsRptTxInfAndStsOrgnlGrpInf;
import com.example.SimuladorCoreBank.service.IResponseRevDebitoService;
import com.example.SimuladorCoreBank.utils.MakeResponseRevDebito;

@Service
public class ImplResponseRevdebito implements IResponseRevDebitoService {

    @Override
    public ReversoDebitoResponse makeResponse() {
        ReversoDebitoResponse reversoDebitoResponse = new ReversoDebitoResponse();

        MakeResponseRevDebito.makeReversoDebitoResponse(reversoDebitoResponse);

        reversoDebitoResponse.getDocument().getHeader().getOrigId().setChannel("IFISPGIM");
        reversoDebitoResponse.getDocument().getHeader().getOrigId().setApp("2");
        reversoDebitoResponse.getDocument().getHeader().getOrigId().getService().setIdServ("0539-");
        reversoDebitoResponse.getDocument().getHeader().getOrigId().getService().setVersServ("1.0");
        reversoDebitoResponse.getDocument().getHeader().getOrigId().setOtherId("00005");

        reversoDebitoResponse.getDocument().getHeader().setSender("0164");
        reversoDebitoResponse.getDocument().getHeader().setReceiver("0738");

        reversoDebitoResponse.getDocument().getHeader().getMge().setType("pacs.002.052");
        reversoDebitoResponse.getDocument().getHeader().getMge().setRoR("RES");
        reversoDebitoResponse.getDocument().getHeader().getMge().setIdMge("0164220329958900005779589");
        reversoDebitoResponse.getDocument().getHeader().getMge().setOpeDate("2022-03-29T13:53:28");

        reversoDebitoResponse.getDocument().getHeader().setPssblDplct("false");
        reversoDebitoResponse.getDocument().getHeader().setPrty("NORM");

// GRPHDR
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setMsgId("0164220329958900005779589");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setCreDtTm("2022-03-29T13:53:28");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setNbOfTxs("1");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getSttInf().setSttlmMtd("INDA");

        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstgAgt().getFinInstnId().getOthr().setId("0164");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstdAgt().getFinInstnId().getOthr().setId("0738");

// TXINFANDSTS
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlMsgId("0164220329958900005779589");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlMsgNmId("pacs.008.071");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlCreDtTm("2022-03-29T13:53:28");

        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setOrgnlEndToEndId("7779589");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setOrgnlTxId("779589");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setTxSts("OK");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setAccptncDtTm("2022-03-29T13:53:28");
        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setAcctSvcrRef("569058");

        reversoDebitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getStsRsnInf().getRsn().setPrtry("0000");
        
        return reversoDebitoResponse;
    }

}
