package cn.com.taiji.example01.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeBean implements InitializingBean,DisposableBean{

	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start lifebean");
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop lifebean");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destory lifebean");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init lifebean");
	}
}
