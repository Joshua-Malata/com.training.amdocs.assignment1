package com.training.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class accountServlet
 */
@WebServlet("/accountServlet")
public class accountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private accountDAO AccountDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	AccountDAO = new accountDAO();
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
		int accountID = 0;
    	
        String accountType = request.getParameter("accountType");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        account Account1 = new account();
        Account1.setAcountType(accountType);
        Account1.setUsername(username);
        Account1.setPassword(password);
        try {
        	AccountDAO.accountRegister(Account1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("accountType", Account1.getAcountType());
        request.setAttribute("username", Account1.getUsername());
        request.setAttribute("password", Account1.getPassword());
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
        requestDispatcher.forward(request, response);
        
	}

}
