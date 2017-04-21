package cn.briup.test;

import java.util.List;

import org.junit.Test;

import cn.briup.dao.Symptom_indexDao;
import cn.briup.domain.Symptom_index;

public class Sympton_indexTest {
	@Test
	public void test() throws Exception{
		Symptom_indexDao sy=new Symptom_indexDao();
		Symptom_index s=new Symptom_index();
		s.setIndex("流");
		List<Symptom_index> list=sy.queryByExample(s);
		System.out.println(list.toString());
	}
}
