import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class servlet extends HttpServlet
{

public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{


res.setContentType("text/html");
PrintWriter pw=res.getWriter();
pw.println("Hello servlet");
pw.close();
}
}
