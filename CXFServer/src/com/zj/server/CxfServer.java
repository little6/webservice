package com.zj.server;

import org.apache.cxf.frontend.ServerFactoryBean;

public class CxfServer {

	public static void main(String[] args) {

		// ���������������...
		ServerFactoryBean bean = new ServerFactoryBean();
		bean.setAddress("http://10.129.69.114:8080/server");// �������ķ��ʵ�ַ
		bean.setServiceClass(CxfWebService.class);// ���÷�����Ľӿ����ͣ����û�нӿ���Ϊ��ǰ��..
		bean.setServiceBean(new CxfWebService());// ���÷������ʵ��
		bean.create();// ��������
	}

}
