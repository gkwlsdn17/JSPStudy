package com.mh.org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mh.org.freeboard.FreeBoardDAO;
import com.mh.org.freeboard.FreeBoardDTO;

/**
 * Servlet implementation class Controller
 */
@WebServlet({"*.ws"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	FreeBoardDAO dao = new FreeBoardDAO();
	
    public Controller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURL().toString();
		//System.out.println("url="+url);
		//url을 맨 마지막 / 이후 글자로 짜른다
		url = url.substring(url.lastIndexOf("/"));
		if(url.equals("/a.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/a.jsp");
			request.setAttribute("hello", "this is servlet");
			rd.forward(request, response);
		}
		else if(url.equals("/b.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/b.jsp");
			rd.forward(request, response);
		}
		else if(url.equals("/c.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/c.jsp");
			rd.forward(request, response);
		}
		else if(url.equals("/index.ws")) {
			List<FreeBoardDTO> list = dao.selectAll();
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
