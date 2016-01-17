package entity.multiple;

import java.util.Hashtable;







/**
 * 享元工厂角色类
 * @author lwl
 *
 */
public class ShareFactory {

	private Hashtable matter = new Hashtable();
	public ShareFactory(){
	}
	
	public Share factory(Character fettle)
	{
		if(matter.containsKey(fettle))
		{
			return (Share)matter.get(fettle);
			
			
		}else {
			Share share = new ConcertShare(fettle);
			matter.put(fettle, share);
			return share;
			
		}
		
		
		
	}
	
	/**
	 * 享元工厂方法，运用String参数传入状态
	 * @param compositeState
	 * @return
	 */
	public Share factory(String compositeState)
	{
		ConcreteCompositeShare concreteCompositeShare =new ConcreteCompositeShare();
		int length = compositeState.length();
		Character fettle = null;
		for (int i = 0; i < length; i++) {
			fettle = new Character(compositeState.charAt(i));
			concreteCompositeShare.add(fettle, this.factory(fettle));
		}
		
		return concreteCompositeShare;
		
		
	}
	
}
