package com.factory.test;
//�������������
//����������Էֹ������еĳ���
public class SimpleFactory {
	
	//ʵ����ͳһ������רҵ������
	//���û�й���ģʽ��С������û��ִ�б�׼��
	public Car getCar(String name){
		if("Bmw".equals(name)){
			return new Bmw();
		}else if("Benz".equals(name)){
			return new Benz();
		}else if("Audi".equals(name)){
			return new Audi();
		}else{
			System.out.println("�޴˳���");
			return null;
		}
	}
}