package com.example.SimuladorCoreBank.service.impl;

import org.springframework.stereotype.Service;

import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuesta;
import com.example.SimuladorCoreBank.service.IResponseNotificacionService;
import com.example.SimuladorCoreBank.utils.MakeResponseNotificacion;

@Service
public class ImplResponseNotificacion implements IResponseNotificacionService {

    @Override
    public NotificacionRespuesta makeResponse() {
        
        NotificacionRespuesta notificacionRespuesta = new NotificacionRespuesta();

        MakeResponseNotificacion.makeNotificacionRespuesta(notificacionRespuesta);

        notificacionRespuesta.getDocument()
                .getBkToCstmrStmtRpt().getStmtRpt().getMge().setType("camt.053.002");
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().getMge().setRoR("RES");
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().getMge().setOrgnlEndToEndId("135526420013");
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().getMge().setCreDtTm("2022-03-29T13:55:26");

        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().setOrgnlTxId("pacs.008.071");
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().setTxSts("OK");

        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().getStsRsnInf().getRsn().setPrtry("0000");
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().getStsRsnInf().setAddtlInf("Su transacción ha sido procesada correctamente.");
       
        return notificacionRespuesta;
    }

}
