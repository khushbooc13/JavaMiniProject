import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class GetPostServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String sub = req.getParameter("sub");
		int fees = 0;
		PrintWriter out = res.getWriter();
		if(sub.equalsIgnoreCase("ajp"))
			fees = 4300;
		else if(sub.equalsIgnoreCase("ste"))
			fees = 3800;
		else if(sub.equalsIgnoreCase("omd"))
			fees = 3800;
		else if(sub.equalsIgnoreCase("ami"))
			fees = 3800;
		out.println("The Fees Of "+sub +" is "+ fees);
		out.close();
	}
}
