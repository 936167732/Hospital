package cn.briup.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.briup.common.IBaseDao;
import cn.briup.common.IResultSetHander;
import cn.briup.common.JdbcTemplate;
import cn.briup.domain.Doctor;
import cn.briup.util.Page;

public class DoctorDao extends JdbcTemplate<Doctor> implements
		IResultSetHander<Doctor>, IBaseDao<Doctor> {
	/**
	 * 这是一个添加方法
	 */
	@Override
	public void save(Doctor e) throws Exception {

		String sql = "INSERT INTO doctor(dname,dphonenum,dtitle,dclassifiction,introduce,dmajor,degree,password,dsex) VALUES(?,?,?,?,?,?,?,?,?)";
		this.update(sql, e.getDname(), e.getDphonenum(), e.getDtitle(),
				e.getDclassifiction(), e.getIntroduce(), e.getDmajor(),
				e.getDegree(), e.getPassword(), e.getDsex());
	}

	// 删除方法
	@Override
	public void deleteById(long id) throws Exception {

		String sql = "DELETE FROM doctor where id=?";
		this.update(sql, id);
	}

	// 修改方法
	@Override
	public void update(Doctor e) throws Exception {

		String sql = "UPDATE doctor SET dname=?,dphonenum=?,dtitle=?,dclassifiction=?,introduce=?,dmajor=?,degree=?,password=?,dsex=? WHERE id=?";
		this.update(sql, e.getDname(), e.getDphonenum(), e.getDtitle(),
				e.getDclassifiction(), e.getIntroduce(), e.getDmajor(),
				e.getDegree(), e.getPassword(), e.getDsex(), e.getDid());
	}

	// 查询方法，可以根据任意个条件数量进行查询
	@Override
	public List<Doctor> queryByExample(Doctor e) throws Exception {

		String sql = "SELECT * FROM doctor where 1=1";
		List<Object> list = new ArrayList<>();
		if (e.getDid() != 0) {
			sql += " and did=?";
			list.add(e.getDid());
		}
		if (!(e.getDname() == null || "".equals(e.getDphonenum()))) {
			sql += " and dname=?";
			list.add(e.getDname());
		}
		System.out.println(e.getDphonenum() == null
				|| "".equals(e.getDphonenum()));
		if (!(e.getDphonenum() == null || "".equals(e.getDphonenum()))) {
			sql += " and dphonenum=?";
			list.add(e.getDphonenum());
		}
		if (!(e.getDtitle() == null || "".equals(e.getDtitle()))) {
			sql += " and dtitle=?";
			list.add(e.getDtitle());
		}
		if (!(e.getDclassifiction() == null || "".equals(e.getDclassifiction()))) {
			sql += " and dclassifiction=?";
			list.add(e.getDclassifiction());
		}
		if (!(e.getIntroduce() == null || "".equals(e.getIntroduce()))) {
			sql += " and introduce=?";
			list.add(e.getIntroduce());
		}
		if (!(e.getDmajor() == null || "".equals(e.getDmajor()))) {
			sql += " and dmajor=?";
			list.add(e.getDmajor());
		}
		if (!(e.getDegree() == null || "".equals(e.getDegree()))) {
			sql += " and degree=?";
			list.add(e.getDegree());
		}
		if (!(e.getDsex() == null || "".equals(e.getDsex()))) {
			sql += " and dsex=?";
			list.add(e.getDsex());
		}
		List<Doctor> result = this.query(sql, this, list);
		return result;
	}

	// 这是一个函数回调方法，可以通过这个对数据库查询到的信息进行对象封装，然后返回一个对象数组
	@Override
	public List<Doctor> handler(ResultSet rs) throws Exception {

		List<Doctor> list = new ArrayList<>();
		while (rs.next()) {
			Doctor doc = new Doctor();
			doc.setDid(rs.getInt("did"));
			doc.setDclassifiction(rs.getString("dclassifiction"));
			doc.setDegree(rs.getString("degree"));
			doc.setDmajor(rs.getString("dmajor"));
			doc.setDname(rs.getString("dname"));
			doc.setDphonenum(rs.getString("dphonenum"));
			doc.setDsex(rs.getString("dsex"));
			doc.setDtitle(rs.getString("dtitle"));
			doc.setIntroduce(rs.getString("introduce"));
			doc.setPassword(rs.getString("password"));
			list.add(doc);
		}
		return list;
	}

	/**
	 * 分页查询
	 * @param 医生对象 e
	 * @param 分页对象 page
	 * @return 查询结果
	 * @throws Exception
	 */
	public List<Doctor> queryByPage(Doctor e, Page page) throws Exception {
		
		/* 查询语句 */
		String sql = "SELECT * FROM doctor where 1=1";
		
		List<Object> list = new ArrayList<>();
		if (e.getDid() != 0) {
			sql += " and did=?";
			list.add(e.getDid());
		}
		if (!(e.getDname() == null || "".equals(e.getDphonenum()))) {
			sql += " and dname=?";
			list.add(e.getDname());
		}
		System.out.println(e.getDphonenum() == null
				|| "".equals(e.getDphonenum()));
		if (!(e.getDphonenum() == null || "".equals(e.getDphonenum()))) {
			sql += " and dphonenum=?";
			list.add(e.getDphonenum());
		}
		if (!(e.getDtitle() == null || "".equals(e.getDtitle()))) {
			sql += " and dtitle=?";
			list.add(e.getDtitle());
		}
		if (!(e.getDclassifiction() == null || "".equals(e.getDclassifiction()))) {
			sql += " and dclassifiction=?";
			list.add(e.getDclassifiction());
		}
		if (!(e.getIntroduce() == null || "".equals(e.getIntroduce()))) {
			sql += " and introduce=?";
			list.add(e.getIntroduce());
		}
		if (!(e.getDmajor() == null || "".equals(e.getDmajor()))) {
			sql += " and dmajor=?";
			list.add(e.getDmajor());
		}
		if (!(e.getDegree() == null || "".equals(e.getDegree()))) {
			sql += " and degree=?";
			list.add(e.getDegree());
		}
		if (!(e.getDsex() == null || "".equals(e.getDsex()))) {
			sql += " and dsex=?";
			list.add(e.getDsex());
		}
		
		sql += " LIMIT ?, ?";
		
		/* 向List中加入 数据起始位置和一页的条数 */
		list.add(page.getStart());
		list.add(page.getSize());
		
		List<Doctor> doctorList = this.query(sql, this, list);
		
		return doctorList;
	}
	
	/**
	 * 查询表中数据的总数
	 * @return 返回医生对象总数的值
	 * @throws Exception
	 */
	public int getAmount(Doctor e) throws Exception{
		
		/* 查询语句 */
		String sql = "SELECT * FROM doctor where 1=1";
		
		List<Object> list = new ArrayList<>();
		
		if (e.getDid() != 0) {
			sql += " and did=?";
			list.add(e.getDid());
		}
		if (!(e.getDname() == null || "".equals(e.getDphonenum()))) {
			sql += " and dname=?";
			list.add(e.getDname());
		}
		System.out.println(e.getDphonenum() == null
				|| "".equals(e.getDphonenum()));
		if (!(e.getDphonenum() == null || "".equals(e.getDphonenum()))) {
			sql += " and dphonenum=?";
			list.add(e.getDphonenum());
		}
		if (!(e.getDtitle() == null || "".equals(e.getDtitle()))) {
			sql += " and dtitle=?";
			list.add(e.getDtitle());
		}
		if (!(e.getDclassifiction() == null || "".equals(e.getDclassifiction()))) {
			sql += " and dclassifiction=?";
			list.add(e.getDclassifiction());
		}
		if (!(e.getIntroduce() == null || "".equals(e.getIntroduce()))) {
			sql += " and introduce=?";
			list.add(e.getIntroduce());
		}
		if (!(e.getDmajor() == null || "".equals(e.getDmajor()))) {
			sql += " and dmajor=?";
			list.add(e.getDmajor());
		}
		if (!(e.getDegree() == null || "".equals(e.getDegree()))) {
			sql += " and degree=?";
			list.add(e.getDegree());
		}
		if (!(e.getDsex() == null || "".equals(e.getDsex()))) {
			sql += " and dsex=?";
			list.add(e.getDsex());
		}
		
		/* 获取查询结果 */
		List<Doctor> doctorList = this.query(sql, this, list);
		
		return doctorList.size();
	}
}
