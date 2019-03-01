import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


		public class AddCookieServlet extends HttpServlet
		{
			public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
			{
				String value=req.getParameter("t");
				PrintWriter out=res.getWriter();
				Cookie c=new Cookie("cookie",value);
				res.addCookie(c);
				out.println("Cookie is added Succesfully");
			}
		}