package com.dqhaihang.epoint.pingbiao_common.hhwebservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2018-01-19T22:40:40.685+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "HaiHangWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface HaiHangWebService {

    @WebMethod
    @RequestWrapper(localName = "getHuiQianInfo", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetHuiQianInfo")
    @ResponseWrapper(localName = "getHuiQianInfoResponse", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetHuiQianInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getHuiQianInfo(
        @WebParam(name = "biaoDuanGuid", targetNamespace = "")
        java.lang.String biaoDuanGuid,
        @WebParam(name = "lunCi", targetNamespace = "")
        java.lang.String lunCi
    );

    @WebMethod
    @RequestWrapper(localName = "getHuiQianLunCi", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetHuiQianLunCi")
    @ResponseWrapper(localName = "getHuiQianLunCiResponse", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetHuiQianLunCiResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getHuiQianLunCi(
        @WebParam(name = "biaoDuanGuid", targetNamespace = "")
        java.lang.String biaoDuanGuid
    );

    @WebMethod
    @RequestWrapper(localName = "getPBResult", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetPBResult")
    @ResponseWrapper(localName = "getPBResultResponse", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetPBResultResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getPBResult(
        @WebParam(name = "biaoDuanGuid", targetNamespace = "")
        java.lang.String biaoDuanGuid
    );

    @WebMethod
    @RequestWrapper(localName = "synchronousAllInfo", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.SynchronousAllInfo")
    @ResponseWrapper(localName = "synchronousAllInfoResponse", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.SynchronousAllInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String synchronousAllInfo(
        @WebParam(name = "biaoDuanGuid", targetNamespace = "")
        java.lang.String biaoDuanGuid
    );

    @WebMethod
    @RequestWrapper(localName = "getAllHuiQianInfo", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetAllHuiQianInfo")
    @ResponseWrapper(localName = "getAllHuiQianInfoResponse", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.GetAllHuiQianInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getAllHuiQianInfo(
        @WebParam(name = "biaoDuanGuid", targetNamespace = "")
        java.lang.String biaoDuanGuid
    );

    @WebMethod
    @RequestWrapper(localName = "isSynPW", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.IsSynPW")
    @ResponseWrapper(localName = "isSynPWResponse", targetNamespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", className = "com.dqhaihang.epoint.pingbiao_common.hhwebservice.IsSynPWResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean isSynPW(
        @WebParam(name = "biaoDuanGuid", targetNamespace = "")
        java.lang.String biaoDuanGuid,
        @WebParam(name = "pwguid", targetNamespace = "")
        java.lang.String pwguid
    );
}
