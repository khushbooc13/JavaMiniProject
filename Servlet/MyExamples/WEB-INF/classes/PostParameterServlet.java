import javax.servlet.*;
import java.util.*;
import java.io.*;


		public class PostParameterServlet extends GenericServlet
		{
			public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
			{
				PrintWriter pw=res.getWriter();
				Enumeration e=req.getParameterNames();
				pw.println("<html><body>");
				res.setContentType("text/html");
				
						while(e.hasMoreElements())
						{
							String pname=e.nextElement()+"";
							//String pname=e.nextElement().toString(),String pname=(String)e.nextElement();
							pw.print("<h3>"+pname+"=</h3>");
							String pvalue=req.getParameter(pname);
							pw.print("<h3>"+pvalue+"</h3>");
						}
					pw.print("</body></html>");
					pw.close();
			}
		}