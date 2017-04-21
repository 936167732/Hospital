package cn.briup.service.impl;

import java.sql.ResultSet;
import java.util.List;

import cn.briup.common.BaseServiceImpl;
import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.dao.HealthDao;
import cn.briup.domain.Health;
import cn.briup.service.IHealthService;

public class HealthServiceImpl extends BaseServiceImpl<Health> implements IHealthService {
	private HealthDao HealthDao = new HealthDao();

	@Override
	public IBaseDao<Health> getDao() throws Exception {

		return HealthDao;
	}

	@Override
	public void addArticle(Health h) throws Exception {
		
		this.getDao().save(h);
		
	}

	@Override
	public void updateArticle(Health h) throws Exception {
		
		this.getDao().update(h);
		
	}

	@Override
	public void deleteArticle(String healthId) throws Exception {
		
		this.getDao().deleteById(Integer.parseInt(healthId));
		
	}

	@Override
	public List<Health> findArticle(String title) throws Exception {
		
		Health health = new Health();
		health.setH_title(title);
		
		return this.getDao().queryByExample(health);
	}

	@Override
	public List<Health> findAllArticles() throws Exception {
		
		Health health = new Health();
			
		return this.getDao().queryByExample(health);
	}

}
