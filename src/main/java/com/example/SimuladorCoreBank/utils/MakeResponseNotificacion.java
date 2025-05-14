package com.example.SimuladorCoreBank.utils;

import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuesta;
import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuestaDocument;
import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuestaDocumentBkToCstmrStmtRpt;
import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRpt;
import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRptMge;
import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRptStsRsnInf;
import com.example.SimuladorCoreBank.model.notificacion.NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRptStsRsnInfRsn;

public class MakeResponseNotificacion {

    public static NotificacionRespuesta makeNotificacionRespuesta(NotificacionRespuesta notificacionRespuesta) {

        notificacionRespuesta.setDocument(new NotificacionRespuestaDocument());
        notificacionRespuesta.getDocument().setBkToCstmrStmtRpt(new NotificacionRespuestaDocumentBkToCstmrStmtRpt());
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().setStmtRpt(new NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRpt());
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().setMge(new NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRptMge());
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().setStsRsnInf(new NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRptStsRsnInf());
        notificacionRespuesta.getDocument().getBkToCstmrStmtRpt().getStmtRpt().getStsRsnInf().setRsn(new NotificacionRespuestaDocumentBkToCstmrStmtRptStmtRptStsRsnInfRsn());

        return notificacionRespuesta;

    }
}
