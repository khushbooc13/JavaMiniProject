import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MyServlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<body bgcolor = blue>");
		out.println("<h1>Welcome To Servlet World</h1>");
		out.println("</body></html>");
		out.close();
	}
}