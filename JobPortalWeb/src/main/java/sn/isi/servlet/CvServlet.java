package sn.isi.servlet;

import java.io.IOException; 

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.ICvLocal;
import sn.isi.entities.Cv;



/**
 * Servlet implementation class CvServlet
 */
@WebServlet("/Cv")
public class CvServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ICvLocal cvdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CvServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		
   	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("cvs", cvdao.liste());
		request.getRequestDispatcher("viewcv.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String speciality = request.getParameter("speciality");
		String level = request.getParameter("level");
		String experience = request.getParameter("experience");
		
		Cv c = new Cv();
		c.setFirstname(firstname);
		c.setLastname(lastname);
		c.setAge(age);
		c.setAddress(address);
		c.setEmail(email);
		c.setPhone(phone);
		c.setSpeciality(speciality);
		c.setLevel(level);
		c.setExperience(experience);
		cvdao.add(c);
		
		doGet(request, response);
		//request.getRequestDispatcher("signup.jsp").forward(request, response);
		
	}

}
