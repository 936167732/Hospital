package cn.briup.test;

import org.junit.Test;

import cn.briup.util.PhoneCheck;

public class TestPhone {
	@Test
	public void test(){
		PhoneCheck p=new PhoneCheck();
		p.send("13672247121");
	}
}
