package cn.briup.common;

import java.util.List;

public interface IBaseDao<E> {
	void save(E e) throws Exception;
	void deleteById(long id) throws Exception;
	void update(E e) throws Exception;
	List<E> queryByExample(E e) throws Exception;
}
