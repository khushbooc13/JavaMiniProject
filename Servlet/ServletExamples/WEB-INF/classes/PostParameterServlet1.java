import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;


		public class PostParameterServlet1 extends HttpServlet
		{
			public void doPOST(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
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