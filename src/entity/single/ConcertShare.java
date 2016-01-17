package entity.single;



/**
 * 具体享元角色类
 * @author lwl
 *
 */
public class ConcertShare implements Share{
	/**
	 * 内蕴状态
	 */
	private Character internalFettle = null;
	
	public ConcertShare(Character fettle)
	{
		
		this.internalFettle = fettle ;
	}
	
	/**
	 * 设置外蕴状态
	 */
	public String work(String fettle) {
		
		return "interalFettle="+internalFettle+",ExteriorFettle="+fettle;
	}
	
	

	
}
