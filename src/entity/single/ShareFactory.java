package entity.single;

import java.util.Hashtable;





/**
 * 享元工厂角色类
 * @author lwl
 *
 */
public class ShareFactory {

	private Hashtable matter = new Hashtable();
	
	public ShareFactory()
	{
		
		
	}
	/**
	 * 式样
	 * @param fettle
	 * @return
	 */
	public Share factory(Character fettle)
	{
		
		if (matter.containsKey(fettle)) {
			return (Share)matter.get(fettle);
		}else{
			
		    Share	share = new ConcertShare(fettle);
			matter.put(fettle, share);
			return share;
		}
	}
	
}
