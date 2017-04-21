package cn.briup.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.mysql.jdbc.StringUtils;
import com.sun.xml.internal.ws.wsdl.parser.MexEntityResolver;

import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.common.JdbcTemplate;
import cn.briup.domain.Patient;

public class PatientDao extends JdbcTemplate<Patient> implements
		IResultSetHander<Patient>, IBaseDao<Patient> {

	@Override
	public void save(Patient e) throws Exception {
		
		/* 判断数据库中是否有相同的病人 */
		if (this.queryByExample(e).size() == 0){
			
			String sql = "insert patient(pname,pphonenum,pidcard,paddress,page,psex,pdoctor) values(?,?,?,?,?,?,?)";
			int update = super.update(sql, e.getPname(), e.getPphonenum(),
					e.getPidcard(), e.getPaddress(), e.getPage(), e.getPsex(),e.getPdoctor());
		}
			
	}

	@Override
	public void deleteById(long id) throws Exception {
		String sql = "delete from patient where pid=?";
		super.update(sql, id);
	}

	@Override
	public void update(Patient e) throws Exception {
		String sql = "update patient set pname=?,pphonenum=?,pidcard=?,paddress=?,page=?,psex=? where pid=?";
		super.update(sql, e.getPname(), e.getPphonenum(), e.getPidcard(),
				e.getPaddress(), e.getPage(), e.getPsex(), e.getPid());
	}

	@Override
	public List<Patient> queryByExample(Patient e) throws Exception {
		LinkedList<Object> list = new LinkedList<Object>();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from patient where 1=1  ");
		if (e.getPid() > 0) {
			sql.append(" and pid=?");
		} else {
			if (e.getPname() != null) {
				sql.append(" and  pname=?");
				list.add(e.getPname());
			}
			if (e.getPphonenum() != null) {
				sql.append(" and pphonenum=?");
				list.add(e.getPphonenum());
			}
			if (e.getPidcard() != null) {
				sql.append(" and pidcard=?");
				list.add(e.getPidcard());
			}
			if (e.getPaddress() != null) {
				sql.append(" and paddress=?");
				list.add(e.getPaddress());
			}
			if (e.getPage() > 0) {
				sql.append(" and page=?");
				list.add(e.getPage());
			}
			if (e.getPsex() != null) {
				sql.append(" and psex=?");
				list.add(e.getPsex());
			}
			if (e.getPdoctor() != null) {
				sql.append(" and pdoctor=?");
				list.add(e.getPdoctor());
			}	
		}

		return query(sql.toString(), this, list);
	}

	@Override
	public List<Patient> handler(ResultSet rs) throws Exception {
		List<Patient> list = new LinkedList<Patient>();
		while (rs.next()) {
			Patient patient = new Patient();
			Object pid = rs.getObject("pid");
			Object pname = rs.getObject("pname");
			Object pphonenum = rs.getObject("pphonenum");
			Object pidcard = rs.getObject("pidcard");
			Object paddress = rs.getObject("paddress");
			Object page = rs.getObject("page");
			Object psex = rs.getObject("psex");
			Object pdoctor = rs.getObject("pdoctor");
			patient.setPid((int) pid);
			patient.setPname((String) pname);
			patient.setPphonenum((String) pphonenum);
			patient.setPidcard((String) pidcard);
			patient.setPaddress((String) paddress);
			patient.setPage((int) page);
			patient.setPsex((String) psex);
			patient.setPdoctor((String) pdoctor);
			list.add(patient);
		}
		return list;
	}

}
