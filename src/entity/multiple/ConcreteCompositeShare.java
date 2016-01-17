package entity.multiple;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
/**
 * 复合享元角色
 * Share对象中包含多个Share对象,复合享元对象本身是不能共享的，但是
 * 由于有多个单享元的备份，不仅可以操作所有这些单享元，而且可以统一地设置外蕴。
 * @author lwl
 *
 */
public class ConcreteCompositeShare implements Share{

	private Hashtable matter = new Hashtable();
	
	
	
	
	
	
	/**
	 * 添加一个新的单纯享元对象到聚集中
	 * @param key
	 * @param share
	 */
	public void add(Character key,Share share)
	{
		matter.put(key, share);
		
	}
	
	
	
	public ConcreteCompositeShare(){}
	
	
	
	/**
	 * 传入外蕴状态
	 */
	public String work(String exteriorFettle) {
		Share share = null;
		for (Iterator iterator = matter.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry entry = (Map.Entry) iterator.next();
			share = (Share)entry.getValue();
			share.work(exteriorFettle);//外蕴状态
			
		}
		return exteriorFettle;
	}

	
}
