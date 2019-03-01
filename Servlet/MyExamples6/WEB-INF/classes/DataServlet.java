import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;


		public class DataServlet extends HttpServlet
		{
			public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
			{
				HttpSession hs=req.getSession(true);
				PrintWriter out=res.getWriter();
				Date date=(Date)hs.getAttribute("date");
				if(date!=null)
				out.println("Last access"+date);
				date=new Date();
				hs.setAttribute("date",date);
				out.println("Current Date:"+date);
			}
		}