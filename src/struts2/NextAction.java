package struts2;

import java.io.UnsupportedEncodingException;

import bean.User;

import com.google.gson.Gson;










public class NextAction {
	
	User user;
	String gsonBean;
	

	
	
	public String getGsonBean() {
		return gsonBean;
	}

	public void setGsonBean(String gsonBean) {
		this.gsonBean = gsonBean;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 享元模式是指：运用共享技术有效地支持大量细粒度的对象。
	 * 当细粒度对象的数量过多时运行的代价相当高，此时运行共享技术可大大降低运行的代价。
	 *   内部状态与外部状态：在享元对象内部并且不会随着环境改变而改变的共享部分，
	 *   可以称之为享元对象的内部状态，反之随着环境改变而改变的，不可共享的状态称之为外部状态。
	 * 
	 * 应用情景：
	 * 当我们对word文档的文字字体进行编辑时，可通过对字体样式的修改阐述单享元模式与多享元模式。
	 * 
	 * @return
	 */
	public String task()
	{
	
		
		
		
		return "task";
		
		
	}
	
	public String nsg()
	{
		System.out.println("request for msg ok!");
		User user=new User();
		user.setName("n林炜量");
		user.setWeight("130");
		NetTransfer.transfer(new Gson().toJson(user));
		
		return "nsg";
	}
	
	public String nGetParams()
	{
		
	
		   Gson gson = new Gson();  
		    byte[] bytes;
		    String str = null;
			try {
				bytes = gsonBean.getBytes("ISO-8859-1");
				 str=new String(bytes,"utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
	        User element = gson.fromJson(str, User.class);
	     
	       
	        NetTransfer.transfer(str);
			System.out.println(str+element.toString());
		return "nGetParams";
	}
	/**
	 * 虽然是注入了对象，但是返回的对象是json字符串
	 * @return
	 */
	public String mPostParams()
	{
		
	    Gson gson = new Gson();  
        User element = gson.fromJson(gsonBean, User.class);
     
       
        NetTransfer.transfer(gsonBean);
		System.out.println(gsonBean+element.toString());
		return "nPostParams";
	}
	
   


    
}
