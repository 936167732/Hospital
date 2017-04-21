package cn.briup.test;
import java.util.Date;

import org.junit.Test;

import cn.briup.dao.SymptonDao;
import cn.briup.domain.Sympton;
public class SymptonTest {
	@Test
	public void Test() throws Exception{
		Sympton s=new Sympton();
		s.setSindex("3");
		SymptonDao sss=new SymptonDao();
		System.out.println(sss.queryByExample(s).toString());
	}
}
