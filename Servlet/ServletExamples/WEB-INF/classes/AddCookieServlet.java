import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddCookieServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String value = req.getParameter("t");
		PrintWriter out = res.getWriter();
		Cookie c = new Cookie("My",value);
		res.addCookie(c);
		out.println("Cookie Has Been Added Successfully");
		out.close();
	}
}