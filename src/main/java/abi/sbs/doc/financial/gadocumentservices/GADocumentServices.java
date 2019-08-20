package abi.sbs.doc.financial.gadocumentservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-710022-redhat-00001
 * 2019-08-13T04:17:25.900-07:00
 * Generated source version: 3.1.11.fuse-710022-redhat-00001
 * 
 */
@WebService(targetNamespace = "http://abi/sbs/doc/financial/GADocumentServices", name = "GADocumentServices")
@XmlSeeAlso({abi.sbs.codedvaluelist.cvl_doc_sta_cd.ObjectFactory.class, abi.im.integrationmanager.ObjectFactory.class, com.cgi.advantage.admin.advresponse.ObjectFactory.class, abi.sbs.doc.actionrequestresponse.ObjectFactory.class, abi.sbs.doc.financial.jv_actiondocument.ObjectFactory.class, abi.sbs.doc.eventrequestresponse.ObjectFactory.class, abi.sbs.ecm.attachment.ObjectFactory.class, abi.sbs.codedvaluelist.cvl_tin_typ.ObjectFactory.class, com.cgi.advantage.admin.advserviceheader.ObjectFactory.class, abi.sbs.codedvaluelist.cvl_doc_phase_cd.ObjectFactory.class, abi.sbs.doc.financial.jv_importdocument.ObjectFactory.class, abi.sbs.doc.importrequestresponse.ObjectFactory.class, abi.sbs.codedvaluelist.cvl_authdi_ind.ObjectFactory.class, abi.sbs.doc.exportrequestresponse.ObjectFactory.class, abi.sbs.codedvaluelist.cvl_pst_pr_id.ObjectFactory.class, abi.sbs.doc.financial.jv_exportdocument.ObjectFactory.class, abi.sbs.doc.financial.jv_eventdocument.ObjectFactory.class, abi.sbs.doc.financial.jvrequestresponse.ObjectFactory.class, abi.sbs.msg.message.ObjectFactory.class, abi.sbs.codedvaluelist.cvl_doc_func_cd.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GADocumentServices {

    @WebMethod(operationName = "JV_import", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_import")
    @WebResult(name = "JV_importResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_importDocument", partName = "JV_importResponse")
    public abi.sbs.doc.financial.jv_importdocument.JVImportResponseType jvImport(
        @WebParam(partName = "JV_import", name = "JV_importDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_importDocument")
        abi.sbs.doc.financial.jv_importdocument.JVImportDocumentType jvImport
    );

    @WebMethod(operationName = "JV_other", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_other")
    @WebResult(name = "JV_otherResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument", partName = "JV_otherResponse")
    public abi.sbs.doc.financial.jv_actiondocument.JVActionResponseType jvOther(
        @WebParam(partName = "JV_other", name = "JV_otherDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument")
        abi.sbs.doc.financial.jv_actiondocument.JVActionDocumentType jvOther
    );

    @WebMethod(operationName = "JV_export", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_export")
    @WebResult(name = "JV_exportResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_exportDocument", partName = "JV_exportResponse")
    public abi.sbs.doc.financial.jv_exportdocument.JVExportResponseType jvExport(
        @WebParam(partName = "JV_export", name = "JV_exportDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_exportDocument")
        abi.sbs.doc.financial.jv_exportdocument.JVExportDocumentType jvExport
    );

    @WebMethod(operationName = "JV_submit", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_submit")
    @WebResult(name = "JV_submitResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument", partName = "JV_submitResponse")
    public abi.sbs.doc.financial.jv_actiondocument.JVActionResponseType jvSubmit(
        @WebParam(partName = "JV_submit", name = "JV_submitDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument")
        abi.sbs.doc.financial.jv_actiondocument.JVActionDocumentType jvSubmit
    );

    @WebMethod(operationName = "JV_ecmexport", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_ecmexport")
    @WebResult(name = "JV_ecmexportResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument", partName = "JV_ecmexportResponse")
    public abi.sbs.doc.financial.jv_actiondocument.JVActionResponseType jvEcmexport(
        @WebParam(partName = "JV_ecmexport", name = "JV_ecmexportDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument")
        abi.sbs.doc.financial.jv_actiondocument.JVActionDocumentType jvEcmexport
    );

    @WebMethod(operationName = "JV_validate", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_validate")
    @WebResult(name = "JV_validateResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument", partName = "JV_validateResponse")
    public abi.sbs.doc.financial.jv_actiondocument.JVActionResponseType jvValidate(
        @WebParam(partName = "JV_validate", name = "JV_validateDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument")
        abi.sbs.doc.financial.jv_actiondocument.JVActionDocumentType jvValidate
    );

    @WebMethod(operationName = "JV_discard", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_discard")
    @WebResult(name = "JV_discardResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument", partName = "JV_discardResponse")
    public abi.sbs.doc.financial.jv_actiondocument.JVActionResponseType jvDiscard(
        @WebParam(partName = "JV_discard", name = "JV_discardDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument")
        abi.sbs.doc.financial.jv_actiondocument.JVActionDocumentType jvDiscard
    );

    @WebMethod(operationName = "JV_notify", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_notify")
    @WebResult(name = "JV_notifyResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_eventDocument", partName = "JV_notifyResponse")
    public abi.sbs.doc.financial.jv_eventdocument.JVEventResponseType jvNotify(
        @WebParam(partName = "JV_notify", name = "JV_notifyDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_eventDocument")
        abi.sbs.doc.financial.jv_eventdocument.JVEventDocumentType jvNotify
    );

    @WebMethod(operationName = "JV_ecmimport", action = "http://abi/sbs/doc/financial/GADocumentServices#JV_ecmimport")
    @WebResult(name = "JV_ecmimportResponse", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument", partName = "JV_ecmimportResponse")
    public abi.sbs.doc.financial.jv_actiondocument.JVActionResponseType jvEcmimport(
        @WebParam(partName = "JV_ecmimport", name = "JV_ecmimportDocument", targetNamespace = "http://abi/sbs/doc/financial/JV_actionDocument")
        abi.sbs.doc.financial.jv_actiondocument.JVActionDocumentType jvEcmimport
    );
}