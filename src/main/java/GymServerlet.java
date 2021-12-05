

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gymmanage.User;
import gymmanage.UserDao;

/**
 * Servlet implementation class GymServerlet
 */
@WebServlet("/GymServerlet")
public class GymServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GymServerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullname");
		String username=request.getParameter("username");
		String age=request.getParameter("age");
		String country=request.getParameter("country");
		String password=request.getParameter("password");
		User user=new User(fullname,username,age,country,password);
		
//		;
		
		UserDao dbcon=new UserDao();
			 String result=dbcon.insert(user);
			 response.getWriter().print(result);
			 
				}
	
	}

