/**
 * LogonServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.service;

public interface LogonServiceService extends javax.xml.rpc.Service {
    public java.lang.String getLogonServiceAddress();

    public com.test.service.LogonService getLogonService() throws javax.xml.rpc.ServiceException;

    public com.test.service.LogonService getLogonService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
