package struts2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class NetTransfer {

	public static void transfer(String str)
	{
		    HttpServletResponse response = ServletActionContext.getResponse();  
		  
	        HttpServletRequest request = ServletActionContext.getRequest(); 
	  
	          
	  
	        response.setContentType("text/plain; charset=UTF-8");  
	  
	        response.setHeader("Content-Disposition", "inline");  
	  
	  
	  
	        PrintWriter writer = null;  
	  
	        try {  
	  
	            writer = response.getWriter();  
	  
	            writer.write(str);  
	  
	        } catch(NullPointerException e) {  
	  
	            if(str.equals("")){  
	  
	               System.out.println("未指定value"+e);  
	  
	            }else{  
	  
	                System.out.println("空"+e);  
	  
	            }  
	  
	        } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {  
	  
	            if (writer != null) {  
	  
	                writer.flush();  
	  
	                writer.close();  
	  
	            }  
	  
	        }  
	}
}
