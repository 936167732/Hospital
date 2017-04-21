package cn.briup.service.impl;

import java.util.Date;
import java.util.List;

import cn.briup.dao.Symptom_indexDao;
import cn.briup.dao.SymptonDao;
import cn.briup.domain.Symptom_index;
import cn.briup.domain.Sympton;
import cn.briup.service.ISymptonService;

import org.junit.Test;
public class SymptonService implements ISymptonService{
	private Symptom_indexDao symptom_indexDao=new Symptom_indexDao();
	private SymptonDao symptonDao=new SymptonDao();
	private List<Symptom_index> list;
	/**
	 * 根据用户输入的症状关键字，来模糊查询出数据库中所有与之想关的症状信息，推送出来
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<Symptom_index> getIndex(Symptom_index s) throws Exception{
		list=symptom_indexDao.queryByExample(s);
		return list;
	}
	
	/**
	 * 根据模糊查询的关键字的某一个所进行的的精确查询
	 * @param index模糊查询的关键字的结果中的某一个
	 * @return
	 * @throws Exception 
	 */
	
	public Sympton getSympton(String index) throws Exception{
		Sympton sympton=new Sympton();
		sympton.setSindex(index);
			sympton=symptonDao.queryByExample(sympton).get(0);
		return sympton;
	}
	/**
	 * 添加症状的方法，同事提交给两个表，来表证两个表的信息的同步
	 * @throws Exception 
	 */
	public boolean saveSympton(Sympton s) throws Exception{
			Symptom_index symptom_index=new Symptom_index();
			symptom_index.setIndex(s.getSindex());
			symptom_indexDao.save(symptom_index);
			symptonDao.save(s);
		return true;
	}
	
	public boolean deleteSympton(Sympton s) throws Exception{
			Symptom_index symptom_index=new Symptom_index();
			symptom_index.setIndex(s.getSindex());
			symptom_indexDao.deleteByIndex(s.getSindex());
			symptonDao.deleteById(s.getSid());
			symptonDao.save(s);
		return true;
	}
	
	@Test 
	public void Test() throws Exception{
		Sympton s=new Sympton();
		s.setSid(3);
		s.setScontext("这个头痛分为好多种，可能是风热感冒，也可能是长了一些东西，请具体检查");
		s.setSindex("头痛");
		s.setStime(new Date());
		this.deleteSympton(s);
	}
}
