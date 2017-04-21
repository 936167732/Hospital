package cn.briup.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.common.JdbcTemplate;
import cn.briup.domain.Health;

public class HealthDao extends JdbcTemplate<Health> implements IResultSetHander<Health>, IBaseDao<Health> {

	@Override
	public void save(Health e) throws Exception {
		String sql="insert health(h_title,h_content,h_image,h_releaseTime) values(?,?,?,?)";
		update(sql,e.getH_title(),e.getH_content(),e.getH_image(),e.getH_releaseTime());
	}

	@Override
	public void deleteById(long id) throws Exception {
		String sql="delete from health where h_id=?";
		update(sql,id);
		
	}

	@Override
	public void update(Health e) throws Exception {
		String sql="update health set h_title=?,h_content=?,h_image=?,h_releaseTime=? where h_id=?";
		update(sql,e.getH_title(),e.getH_content(),e.getH_image(),e.getH_releaseTime(),e.getH_id());
		
	}

	@Override
	public List<Health> queryByExample(Health e) throws Exception {
		StringBuffer sql=new StringBuffer();
		LinkedList<Object> list=new LinkedList<Object>();
		sql.append("select * from health whre 1=1");
		if(e.getH_id()>0){
			sql.append(" and h_id=?");
			list.add(e.getH_id());
		}else{
			if(e.getH_image()!=null){
				sql.append(" and h_image=?");
				list.add(e.getH_image());
			}
			if(e.getH_content()!=null){
				sql.append(" and h_content=?");
				list.add(e.getH_content());
			}
			if(e.getH_releaseTime()!=null){
				sql.append(" and h_releaseTime=?");
				list.add(e.getH_releaseTime());
			}
			if(e.getH_title()!=null){
				sql.append(" and h_title=?");
				list.add(e.getH_title());
			}
		}
		
		return query(sql.toString(), this, list);
	}

	@Override
	public List<Health> handler(ResultSet rs) throws Exception {
		List<Health> list=new ArrayList<Health>();
		while(rs.next()){
			Health e=new Health();
			Object h_id = rs.getObject("h_id");
			Object h_title = rs.getObject("h_title");
			Object h_content = rs.getObject("h_content");
			Object h_image = rs.getObject("h_image");
			Object h_releaseTime = rs.getObject("h_releaseTime");
			e.setH_id((int) h_id);
			e.setH_title((String) h_title);
			e.setH_content((String) h_content);
			e.setH_image((String) h_image);
			e.setH_releaseTime((Date) h_releaseTime);
			list.add(e);
		}
		return list;
	}
	
	 
	 
	 
	 
}
