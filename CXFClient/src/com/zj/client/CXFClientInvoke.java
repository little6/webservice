package com.zj.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

import com.zj.server.CxfWebServicePortType;

public class CXFClientInvoke {

	public static void main(String[] args) {
		// ��������webservice �������...
		ClientProxyFactoryBean bean = new ClientProxyFactoryBean();
		bean.setAddress("http://10.129.69.114:8080/server");// ���÷��ʵ�ַ...
		bean.setServiceClass(CxfWebServicePortType.class);// ���÷���Ľӿ�...
		// �����ӿ�����...
		CxfWebServicePortType cxfWebServicePortType = (CxfWebServicePortType) bean.create();
		cxfWebServicePortType.sayHello();
	}

}
