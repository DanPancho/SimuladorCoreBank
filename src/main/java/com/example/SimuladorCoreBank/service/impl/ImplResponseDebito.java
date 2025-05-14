package com.example.SimuladorCoreBank.service.impl;

import org.springframework.stereotype.Service;

import com.example.SimuladorCoreBank.model.debito.DebitoResponse;
import com.example.SimuladorCoreBank.service.IResponseDebitoService;
import com.example.SimuladorCoreBank.utils.MakeResponseDebito;

@Service
public class ImplResponseDebito implements IResponseDebitoService {

    @Override
    public DebitoResponse makeResponse() {
        DebitoResponse debitoResponse = new DebitoResponse();

        MakeResponseDebito.makDebitoResponse(debitoResponse);

        debitoResponse.getDocument().getHeader().getOrigId().setChannel("IFISPGIM");
        debitoResponse.getDocument().getHeader().getOrigId().setApp("1");
        debitoResponse.getDocument().getHeader().getOrigId().getService().setIdServ("0539+");
        debitoResponse.getDocument().getHeader().getOrigId().getService().setVersServ("1.0");
        debitoResponse.getDocument().getHeader().getOrigId().setOtherId("00005");
        debitoResponse.getDocument().getHeader().setSender("0164");
        debitoResponse.getDocument().getHeader().setReceiver("0738");
        debitoResponse.getDocument().getHeader().getMge().setType("pacs.002.072");
        debitoResponse.getDocument().getHeader().getMge().setRoR("RES");
        debitoResponse.getDocument().getHeader().getMge().setIdMge("0164220329967400005779674");
        debitoResponse.getDocument().getHeader().getMge().setOpeDate("2022-03-29T13:55:18");
        debitoResponse.getDocument().getHeader().setPssblDplct("false");
        debitoResponse.getDocument().getHeader().setPrty("NORM");

        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setMsgId("0164220329967400005779674");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setCreDtTm("2022-03-29T13:55:18");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().setNbOfTxs("1");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getSttInf().setSttlmMtd("INDA");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstgAgt().getFinInstnId().getOthr().setId("0164");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getGrpHdr().getInstdAgt().getFinInstnId().getOthr().setId("0738");

        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlMsgId("0164220329967400005779674");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlMsgNmId("pacs.008.071");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlCreDtTm("2022-03-29T13:55:18");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setOrgnlEndToEndId("20220405092826603652");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setOrgnlTxId("779674");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setTxSts("OK");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getStsRsnInf().getRsn().setPrtry("0000");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getStsRsnInf().setAddtlInf("Su transacción ha sido procesada correctamente");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setAccptncDtTm("2022-03-29 13:55:19");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().setAcctSvcrRef("616185");
        debitoResponse.getDocument().getFiToFIDbtPmtStsRpt().getTxInfAndSts().getSplmtryData().getEnvlp().getCnts().setConfCode("");
        return debitoResponse;
    }

}
