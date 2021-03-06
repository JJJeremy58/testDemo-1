package com.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ZhongJie implements MethodInterceptor {

	// 获取被代理人的对象
	public Object getInstance(Object obj) throws Exception {
		// 通过反射机制给他实例化
		Enhancer enhancer= new Enhancer();
		// 把父类设置为某类
		// 这一步就是告诉cglib，生成的子类需要继承哪个父类
		enhancer.setSuperclass(obj.getClass());
		// 设置回调
		enhancer.setCallback(this);
		// 生成源代码 编译class文件 加载到JVM文件，并且返回被代理对象
		return enhancer.create();
	}

	// 同样是做了一件字节码重这样一件事
	// 对于使用api的用户而言是无感知的
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("我是中介 CQ");
		// 这个obj的引用是由CGLib帮我们new出来的
		// cglib new出来以后的对象，是被代理对象的子类(集成了我们自己写的那个类)
		// OOP，在new子类之前，实际上默认先调用了我们super()方法的
		// new了子类的同时，必须先new出来父类,这就相当于间接的持有了我们父类的引用
		// 子类重写了父类的所有方法
		// 我们改变子类对象的某些属性，是可以间接地操作父类的属性
		proxy.invokeSuper(obj, args);
		return null;
	}

}
