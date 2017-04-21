package cn.briup.dao;

import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.common.JdbcTemplate;
import cn.briup.domain.Appointment;
import cn.briup.domain.Patient;

public class AppointmentDao extends JdbcTemplate<Appointment> implements
		IResultSetHander<Appointment>, IBaseDao<Appointment> {
	@Override
	public void save(Appointment e) throws Exception {
		String sql = "insert into appointment(did,pid,time,diagnosis) values(?,?,?,?)";
		update(sql, e.getDid(), e.getPid(), e.getTime(),e.getDiagnosis());

	}

	@Override
	public void deleteById(long id) throws Exception {
		String sql = "delete from appointment where id=?";
		update(sql, id);
	}

	@Override
	public void update(Appointment e) throws Exception {
		String sql = "update appointment set did=?,pid=?,time=?,diagnosis=? where id=?";
		update(sql, e.getDid(), e.getPid(), e.getTime(),e.getDiagnosis(), e.getId());
	}

	@Override
	public List<Appointment> queryByExample(Appointment e) throws Exception {
		LinkedList<Object> list = new LinkedList<Object>();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from appointment where 1=1");
		if (e.getId() > 0) {
			sql.append(" and id=?");
			list.add(e.getId());
		} else {
			if (e.getDid() > 0) {
				sql.append(" and did=?");
				list.add(e.getDid());
			}
			if (e.getPid() > 0) {
				sql.append(" and pid=?");
				list.add(e.getPid());
			}
			if (e.getTime() != null) {
				sql.append(" and time=?");
				list.add(e.getTime());
			}
			if(e.getDiagnosis()>0){
				sql.append(" and diagnosis=?");
				list.add(e.getDiagnosis());
			}
		}
		return query(sql.toString(), this, list);

	}

	@Override
	public List<Appointment> handler(ResultSet rs) throws Exception {
		List<Appointment> list = new ArrayList<Appointment>();
		while (rs.next()) {
			Appointment appointment = new Appointment();
			Object id = rs.getObject("id");
			Object did = rs.getObject("did");
			Object pid = rs.getObject("pid");
			Date time = rs.getDate("time");
			appointment.setId((int) id);
			appointment.setDid((int) did);
			appointment.setPid((int) pid);
			appointment.setTime(time);
			list.add(appointment);
		}
		return list;
	}

}
