package cn.briup.util;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;




/**
 * 用于对将list数据转换为json字符串并且剔除某些不需要的字段
 * @author NIE
 * 20172017年3月4日下午11:09:12
 */
public class fastjson {
	
	public static <T> String  fastjsonway(List<T> list,String[] condition ){
		final String[] conditions=condition;
		
		PropertyFilter profilter = new PropertyFilter(){  
            @Override  
            public boolean apply(Object object, String name, Object value) {  
               for(String con :conditions){
            	   if(name.equalsIgnoreCase(con)){  
                       //false表示last字段将被排除在外  
                       return false;  
                   }
               }
                return true;  
            } 
		};
		//表之间的关联，需要将不需要的信息去除
		return JSON.toJSONString(list,profilter);
	}
}
