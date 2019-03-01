import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class SessionDateServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(true);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Date date = (Date)hs.getAttribute("date");
		out.println("<html><body>");
		out.println("<body bgcolor = gray>");
		if(date!=null)
			out.println("Last Access "+date);
		date = new Date();
		hs.setAttribute("date",date);
		out.println("\t \tCurrent Date : "+date);
		out.println("</body></html>");
		out.close();
	}
}