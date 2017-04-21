package cn.briup.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.common.JdbcTemplate;
import cn.briup.domain.Appointment;
import cn.briup.domain.Worksetting;

public class WorksettingDao extends JdbcTemplate<Worksetting> implements
		IResultSetHander<Worksetting>, IBaseDao<Worksetting> {

	@Override
	public void save(Worksetting e) throws Exception {
		String sql = "insert worksetting(did,workroom,appointment_sum) values(?,?,?,?,?)";
		update(sql, e.getDid(), e.getWorkroom(), e.getAppointment_sum(), e.getWorking_hours(), e.getOff_hours());

	}

	@Override
	public void deleteById(long id) throws Exception {
		String sql = "delete from worksetting where id=?";
		update(sql, id);

	}

	@Override
	public void update(Worksetting e) throws Exception {
		String sql = "update worksetting set did=?,workroom=?,appointment_sum=?, working_hours=?, off_hours=? where id=?";
		update(sql, e.getDid(), e.getWorkroom(), e.getAppointment_sum(), e.getWorking_hours(), e.getOff_hours(), e.getId());

	}

	@Override
	public List<Worksetting> queryByExample(Worksetting e) throws Exception {
		LinkedList<Object> list = new LinkedList<Object>();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from worksetting where 1=1  ");
		if (e.getId() > 0) {
			sql.append(" and id=?");
		} else {
			if (e.getDid() > 0) {
				sql.append(" and  did=?");
				list.add(e.getDid());
			}
			if (e.getWorkroom() != null) {
				sql.append(" and workroom=?");
				list.add(e.getAppointment_sum() > 0);
			}
			if (e.getWorking_hours() != null) {
				sql.append(" and working_hours=?");
				list.add(e.getWorking_hours());
			}
			if (e.getOff_hours() != null) {
				sql.append(" and off_hours=?");
				list.add(e.getOff_hours());
			}
		}
		return query(sql.toString(), this, list);
	}

	@Override
	public List<Worksetting> handler(ResultSet rs) throws Exception {
		List<Worksetting> list = new ArrayList<Worksetting>();
		while (rs.next()) {
			Worksetting worksetting = new Worksetting();
			Object id = rs.getObject("id");
			Object did = rs.getObject("did");
			Object workroom = rs.getObject("workroom");
			Object appointment_sum = rs.getObject("appointment_sum");
			Object working_hours = rs.getObject("working_hours");
			Object off_hours = rs.getObject("off_hours");
			worksetting.setId((int) id);
			worksetting.setDid((int) did);
			worksetting.setWorkroom((String) workroom);
			worksetting.setAppointment_sum((int) appointment_sum);
			worksetting.setWorking_hours((String) working_hours); 
			worksetting.setOff_hours((String) off_hours);
			list.add(worksetting);
		}
		return list;
	}
}
