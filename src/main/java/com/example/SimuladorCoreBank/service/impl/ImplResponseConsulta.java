package com.example.SimuladorCoreBank.service.impl;

import org.springframework.stereotype.Service;

import com.example.SimuladorCoreBank.model.consulta.ConsultaResponse;

import com.example.SimuladorCoreBank.service.IResponseConsultaService;
import com.example.SimuladorCoreBank.utils.MakeResponseConsulta;

@Service
public class ImplResponseConsulta implements IResponseConsultaService{


    @Override
    public ConsultaResponse makeResponse() {
        ConsultaResponse consultaResponse = new ConsultaResponse();

        MakeResponseConsulta.makeResponseConsulta(consultaResponse);
        
        // HEADER
        consultaResponse.getDocument().getHeader().getOrigId().setChannel("IFISPGIM");
        consultaResponse.getDocument().getHeader().getOrigId().setApp("1");
        consultaResponse.getDocument().getHeader().getOrigId().getService().setIdServ("0163+");
        consultaResponse.getDocument().getHeader().getOrigId().getService().setVersServ("1.0");
        consultaResponse.getDocument().getHeader().getOrigId().setOtherId("30081");
        consultaResponse.getDocument().getHeader().setSender("0198");
        consultaResponse.getDocument().getHeader().setReceiver("0704");
        consultaResponse.getDocument().getHeader().getMge().setType("camt.998.241");
        consultaResponse.getDocument().getHeader().getMge().setRoR("REQ");
        consultaResponse.getDocument().getHeader().getMge().setIdMge("0198220405365230081603652");
        consultaResponse.getDocument().getHeader().getMge().setOpeDate("2022-04-05T09:28:26");
        consultaResponse.getDocument().getHeader().setPssblDplct("false");
        consultaResponse.getDocument().getHeader().setPrty("NORM");


        // GROUP HEADER
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().setMsgId("0198220405365230081603652");
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().setCreDtTm("2022-04-05T09:28:26");
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().setNbOfTxs("1");
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().getSttInf().setSttlmMtd("INDA");
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().getInstgAgt().getFinInstnId().getOthr().setId("0198");
        consultaResponse.getDocument().getPrtryMsgRpt().getGrpHdr().getInstdAgt().getFinInstnId().getOthr().setId("0704");
        
        // RESPONSE
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().getOrgnlGrpInf().setOrgnlMsgId("0198220405365230081603652");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().getOrgnlGrpInf().setOrgnlMsgNmId("camt.998.241");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().getOrgnlGrpInf().setOrgnlCreDtTm("2022-04-05T09:28:26");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setOrgnlEndToEndId("20220405092826603652");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setOrgnlTxId("603652");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setTxSts("OK");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().getStsRsnInf().getRsn().setPrtry("0000");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().getStsRsnInf().setAddtlInf("Su transacción ha sido procesada correctamente.");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setAlias("CELULAR");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setValue("09XXXXXXXX");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setNm("NOMBRE 123");
        consultaResponse.getDocument().getPrtryMsgRpt().getGetInfoRpt().setId("0900301029");
        return consultaResponse;
    }
    
}
