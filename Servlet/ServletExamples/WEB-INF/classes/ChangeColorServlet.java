import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ChangeColorServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String color = req.getParameter("color");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		if(color.equalsIgnoreCase("red"))
			out.println("<body bgcolor = red>"); // " \" is used for double quotes
		else if(color.equalsIgnoreCase("blue"))
			out.println("<body bgcolor = blue>");
		else if(color.equalsIgnoreCase("green"))
			out.println("<body bgcolor = green>");
		else if(color.equalsIgnoreCase("yellow"))
			out.println("<body bgcolor = \"yellow\">");
		out.println("</body></html>");
		out.close();
	}
}
