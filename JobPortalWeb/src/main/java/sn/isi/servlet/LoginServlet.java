package sn.isi.servlet;

import java.io.IOException; 
import java.sql.PreparedStatement;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.isi.dao.IUserLocal;
import sn.isi.entities.User;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;
	 private static final String PERSISTENCE_UNIT_NAME = "jobportalEJB"; // nom de l'unité de persistance définie dans persistence.xml
	
	@EJB
	private IUserLocal userdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	   // Récupérer les informations d'identification de l'utilisateur à partir des paramètres de la requête
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		
		// Créer un EntityManagerFactory et un EntityManager pour gérer la communication avec la base de données
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        
        try {
            // Exécuter une requête SELECT pour récupérer l'enregistrement utilisateur correspondant aux informations d'identification entrées
            TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE u.login = :login AND u.password = :password", User.class);
            query.setParameter("login", login);
            query.setParameter("password", password);
            User user = query.getSingleResult();
            
            // Si un enregistrement utilisateur correspondant est trouvé, stocker les informations d'identification de l'utilisateur dans la session HttpSession
            if (user != null) 
            {
                HttpSession session = request.getSession();
                session.setAttribute("login", login);
                session.setAttribute("password", password);
                response.sendRedirect("admin.jsp");
            }
            // Si aucun enregistrement utilisateur correspondant n'est trouvé, rediriger l'utilisateur vers une page d'erreur de connexion
            else 
            
            {
                response.sendRedirect("error.jsp");
            }
        }
        catch (NoResultException ex) {
            response.sendRedirect("error.jsp");
        }
        finally {
            // Fermer l'EntityManager et l'EntityManagerFactory
            em.close();
            emf.close();
        }
    }
	

}
