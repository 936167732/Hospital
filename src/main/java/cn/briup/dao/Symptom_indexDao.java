package cn.briup.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.common.JdbcTemplate;
import cn.briup.domain.Symptom_index;

public class Symptom_indexDao extends JdbcTemplate<Symptom_index> implements IResultSetHander<Symptom_index>,IBaseDao<Symptom_index> {

	@Override
	public void save(Symptom_index e) throws Exception {
		String sql="INSERT INTO symptom_index(sindex) VALUES(?)";
		this.update(sql, e.getIndex());
	}

	@Override
	public void deleteById(long id) throws Exception {
		String sql="delete from symptom_index WHERE id=?";
		this.update(sql,id);
	}
	
	public void deleteByIndex(String index) throws Exception{
		String sql="DELETE FROM symptom_index WHERE sindex=?";
		this.update(sql,index);
	}

	@Override
	public void update(Symptom_index e) throws Exception {
		String sql="UPDATE symptom_index SET sindex=? WHERE siid=?";
		this.update(sql,e.getIndex(),e.getSiid());
	}

	@Override
	public List<Symptom_index> queryByExample(Symptom_index e) throws Exception {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM symptom_index WHERE sindex like ?";
		List<Object> li=new ArrayList<Object>();
		li.add("%"+e.getIndex()+"%");
		List<Symptom_index> list=this.query(sql, this, li);
		return list;
	}

	@Override
	public List<Symptom_index> handler(ResultSet rs) throws Exception {
		List<Symptom_index> list=new ArrayList<Symptom_index>();
		while(rs.next()){
			Symptom_index s=new Symptom_index();
			s.setSiid(rs.getInt("siid"));
			s.setIndex(rs.getString("sindex"));
			list.add(s);
		}
		return list;
	}

}
