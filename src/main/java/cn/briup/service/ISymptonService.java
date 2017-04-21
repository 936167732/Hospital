package cn.briup.service;

import java.util.List;

import cn.briup.domain.Symptom_index;
import cn.briup.domain.Sympton;

public interface ISymptonService {
	/**
	 * 根据用户输入的症状关键字，来模糊查询出数据库中所有与之想关的症状信息，推送出来
	 * @return
	 * @throws Exception 
	 */
	public List<Symptom_index> getIndex(Symptom_index s) throws Exception;
	/**
	 * 根据模糊查询的关键字的某一个所进行的的精确查询
	 * @param index模糊查询的关键字的结果中的某一个
	 * @return
	 * @throws Exception 
	 */
	public Sympton getSympton(String index) throws Exception;
	/**
	 * 添加症状的方法，同事提交给两个表，来表证两个表的信息的同步
	 * @throws Exception 
	 */
	public boolean saveSympton(Sympton s) throws Exception;
	/**
	 * 一个删除的方法，两张表必须同时删除信息，防止出现一张表删除的情况
	 * @param s
	 * @return
	 * @throws Exception
	 */
	public boolean deleteSympton(Sympton s) throws Exception;
}
