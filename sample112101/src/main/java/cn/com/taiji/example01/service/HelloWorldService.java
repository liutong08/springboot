package cn.com.taiji.example01.service;

public class HelloWorldService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloWorldService() {
		super();
	}

	public HelloWorldService(String name) {
		super();
		this.name = name;
	}
	
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello " + this.name);
	}
}
