package cn.com.taiji.example01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.com.taiji.example01.service.HelloWorldService;

public class SampleMain {
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:beans.xml");
		int i=context.getBeanDefinitionCount();
		System.out.println("bean的个数:"+i);
		String[] names=context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.print(string+"-->");
			Object bean=context.getBean(string);
			System.out.println(bean.getClass());
		}
		context.getBean("helloWorldService",HelloWorldService.class).sayHello();

//		HelloWorldService hello=(HelloWorldService) context.getBean("helloWorldService");
//		hello.sayHello();
		
		
	}

}
