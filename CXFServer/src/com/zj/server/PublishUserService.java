package com.zj.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import cn.itcast.webservice.userService.UserService;
import cn.itcast.webservice.userService.UserServiceImpl;

/**
 * 
 * ʹ��cxf �ṩ���� JaxWsServerFactoryBean ������һ�����ӿڵ�webservice ...
 * 
 * @ ���� zhuwu@itcast.cn
 *
 */
public class PublishUserService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//������������� ��...
		JaxWsServerFactoryBean  bean=new JaxWsServerFactoryBean();
		//���ö���ķ��ʵ�ַ
		bean.setAddress("http://10.129.69.114:7418/userService");
		bean.setServiceClass(UserService.class);//���ýӿ�����...
		bean.setServiceBean(new UserServiceImpl());//���ýӿڵ�ʵ����...
		//���ǿ����ڷ��������ʱ�������Ϣ������
		//���ؿͻ���������� ���͵��������Ϣ
		bean.getInInterceptors().add(new LoggingInInterceptor());
		//���ط�������ͻ��˷��ص���Ϣ...
		bean.getOutInterceptors().add(new LoggingOutInterceptor());
		
		bean.create();
	}

}
