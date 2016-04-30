package com.test.service;

public class LogonServiceProxy implements com.test.service.LogonService {
  private String _endpoint = null;
  private com.test.service.LogonService logonService = null;
  
  public LogonServiceProxy() {
    _initLogonServiceProxy();
  }
  
  public LogonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLogonServiceProxy();
  }
  
  private void _initLogonServiceProxy() {
    try {
      logonService = (new com.test.service.LogonServiceServiceLocator()).getLogonService();
      if (logonService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)logonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)logonService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (logonService != null)
      ((javax.xml.rpc.Stub)logonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.test.service.LogonService getLogonService() {
    if (logonService == null)
      _initLogonServiceProxy();
    return logonService;
  }
  
  public void checkUserRight(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException{
    if (logonService == null)
      _initLogonServiceProxy();
    logonService.checkUserRight(userId, password);
  }
  
  
}