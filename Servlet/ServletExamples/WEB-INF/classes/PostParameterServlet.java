import javax.servlet.*;
import java.util.*;
import java.io.*;
public class PostParameterServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		Enumeration e = req.getParameterNames();
		pw.println("<html><body>");
		while(e.hasMoreElements())
		{
			String pname = e.nextElement()+"";//to convert in string add ""
			pw.print("<h3>"+pname+" = </h3>");
			String pvalue = req.getParameter(pname);
			pw.println("<h3>"+pvalue+"</h3>");
		}
		pw.println("</body></html>");
		pw.close();//to release print writer so that v cn reuse it again
	}
}