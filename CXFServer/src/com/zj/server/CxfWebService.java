package com.zj.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
//����һ��soap1.2�汾��Э��...
@BindingType(value=SOAPBinding.SOAP12HTTP_BINDING)
public class CxfWebService {

	public void sayHello(){
		System.out.println("���ҳ������������������ɺã�");
	}
	
}
