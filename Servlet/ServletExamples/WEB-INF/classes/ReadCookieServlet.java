import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ReadCookieServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Cookie[] cookies = req.getCookies();
		res.setContentType("html/text");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<body bgcolor=yellow>");
		for(int i = 0;i<cookies.length;i++)
		{
			String name = cookies[i].getName();
			String value = cookies[i].getValue();
			out.println("Cookie Name : "+name);
			out.println("Cookie Value : "+value);
		}
		out.println("</body></html>");
		out.close();
	}
}