package cn.briup.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.common.JdbcTemplate;
import cn.briup.domain.Sympton;

public class SymptonDao extends JdbcTemplate<Sympton> implements IResultSetHander<Sympton>,IBaseDao<Sympton> {

	@Override
	public void save(Sympton e) throws Exception {
		// TODO Auto-generated method stub
		String sql="INSERT INTO sympton(sindex,scontext,stime) VALUES(?,?,?)";
		this.update(sql, e.getSindex(),e.getScontext(),e.getStime());
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		String sql="DELETE FROM sympton WHERE sid=?";
		this.update(sql, id);
	}

	@Override
	public void update(Sympton e) throws Exception {
		// TODO Auto-generated method stub
		String sql="UPDATE sympton SET sindex=?,scontext=?,stime=? WHERE sid=?";
		this.update(sql, e.getSindex(),e.getScontext(),e.getStime(),e.getSid());
	}

	@Override
	public List<Sympton> queryByExample(Sympton e) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
		List<Object> li=new ArrayList<Object>();
		sql.append("SELECT * FROM sympton WHERE 1=1");
		if(e.getSid()>0){
			sql.append(" and sid=?");
			li.add(e.getSid());
		}else{
			if(!(e.getSindex()==null||"".equals(e.getSindex()))){sql.append(" and sindex=?");li.add(e.getSindex());}
			if(!(e.getScontext()==null||"".equals(e.getScontext()))){sql.append(" and scontext=?");li.add(e.getScontext());}
			if(!(e.getStime()==null||"".equals(e.getStime()))){sql.append(" and stime=?");li.add(e.getStime());}
		}
		System.out.println(sql.toString());
		List<Sympton> list=this.query(sql.toString(), this, li);
		return list;
	}

	@Override
	public List<Sympton> handler(ResultSet rs) throws Exception {
		List<Sympton> list=new ArrayList<>();
		while(rs.next()){
			Sympton s=new Sympton();
			s.setSid(rs.getInt("sid"));
			s.setSindex(rs.getString("sindex"));
			s.setScontext(rs.getString("scontext"));
			s.setStime(rs.getDate("stime"));
			list.add(s);
		}
		return list;
	}

}
