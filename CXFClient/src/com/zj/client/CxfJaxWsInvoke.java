package com.zj.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.itcast.webservice.userservice.UserService;



/**
 * 
 * ʹ��JaxWsProxyFactoryBean ���÷���..
 * @ ���� zhuwu@itcast.cn
 * 
 * ��Ҫ����һ���ӿ�...
 *
 */
public class CxfJaxWsInvoke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������÷������...
		JaxWsProxyFactoryBean bean=new JaxWsProxyFactoryBean();
		//���÷��ʵ�ַ
		bean.setAddress("http://10.129.69.114:7418/userService");
		//���ýӿ�����...
		bean.setServiceClass(UserService.class);
		UserService us=(UserService) bean.create();
		
		String data=us.getUserById(1);
		
		System.out.println(data);

	}

}
