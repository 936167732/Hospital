package cn.briup.service;

import java.util.List;

import cn.briup.common.IBaseService;
import cn.briup.domain.Health;

public interface IHealthService extends IBaseService<Health> {
	
	/* 添加文章 */
	public void addArticle(Health h) throws Exception;
	
	/* 修改文章 */
	public void updateArticle(Health h) throws Exception;
	
	/* 通过文章Id，删除文章 */
	public void deleteArticle(String healthId) throws Exception;
	
	/* 通过标题查询文章 */
	public List<Health> findArticle(String title) throws Exception;
	
	/* 查找所有文章 */
	public List<Health> findAllArticles() throws Exception;
}
