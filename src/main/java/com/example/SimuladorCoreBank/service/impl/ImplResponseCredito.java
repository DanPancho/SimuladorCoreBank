package com.example.SimuladorCoreBank.service.impl;

import org.springframework.stereotype.Service;

import com.example.SimuladorCoreBank.model.credito.CreditoResponse;
import com.example.SimuladorCoreBank.service.IResponseCreditoService;
import com.example.SimuladorCoreBank.utils.MakeResponseCredito;

@Service
public class ImplResponseCredito implements IResponseCreditoService {

    @Override
    public CreditoResponse makResponse() {

        CreditoResponse creditoResponse = new CreditoResponse();

        MakeResponseCredito.makeResponse(creditoResponse);

        creditoResponse.getDocument().getHeader().getOrigId().setChannel("IFISPGIM");
        creditoResponse.getDocument().getHeader().getOrigId().setApp("1");
        creditoResponse.getDocument().getHeader().getOrigId().getService().setIdServ("0539+");
        creditoResponse.getDocument().getHeader().getOrigId().getService().setVersServ("1.0");
        creditoResponse.getDocument().getHeader().getOrigId().setOtherId("00005");

        creditoResponse.getDocument().getHeader().setSender("0198");
        creditoResponse.getDocument().getHeader().setReceiver("0704");

        creditoResponse.getDocument().getHeader().getMge().setType("pacs.002.022");
        creditoResponse.getDocument().getHeader().getMge().setRoR("RES");
        creditoResponse.getDocument().getHeader().getMge().setIdMge("0198220310531900005605319");
        creditoResponse.getDocument().getHeader().getMge().setOpeDate("2022-03-10T15:31:29");

        creditoResponse.getDocument().getHeader().setPssblDplct("false");
        creditoResponse.getDocument().getHeader().setPrty("NORM");

        creditoResponse.getDocument().getFiToFIPmtStsRpt().getGrpHdr().setMsgId("0198220310531900005605319");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getGrpHdr().setCreDtTm("2022-03-10T15:31:29");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getGrpHdr().setNbOfTxs("1");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getGrpHdr().getSttInf().setSttlmMtd("INDA");

        creditoResponse.getDocument().getFiToFIPmtStsRpt().getGrpHdr().getInstgAgt().getFinInstnId().getOthr().setId("0198");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getGrpHdr().getInstdAgt().getFinInstnId().getOthr().setId("0704");

        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlMsgId("0198220310531900005605319");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlMsgNmId("pacs.008.021");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().getOrgnlGrpInf().setOrgnlCreDtTm("2022-03-10T15:31:29");

        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().setOrgnlEndToEndId("45454544000605007");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().setOrgnlTxId("605319");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().setTxSts("OK");

        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().getStsRsnInf().getRsn().setPrtry("0000");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().getStsRsnInf().setAddtlInf("Su transacción ha sido procesada correctamente");

        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().setAccptncDtTm("2022-03-14 11:14:03");
        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().setAcctSvcrRef("615966");

        creditoResponse.getDocument().getFiToFIPmtStsRpt().getTxInfAndSts().getSplmtryData().getEnvlp().getCnts().setConfCode("");
        
        return creditoResponse;
    }

}
