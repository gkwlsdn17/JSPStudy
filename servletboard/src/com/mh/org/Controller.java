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
import com.oracle.jrockit.jfr.RequestDelegate;

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
			int pagecount = dao.selectPageCount();
			request.setAttribute("pagecount", pagecount);
			
			String page = request.getParameter("page");
			if(page==null) {
				page = "1";
			}
			int ipage = Integer.parseInt(page);
			// 1page = 1  ~ 10
			// 2page = 11 ~ 20 -->   page * 10 - 9 ~ page * 10
			ipage = ipage * 10 -9;
			int lpage = ipage+9;
			
			List<FreeBoardDTO> list = dao.selectAll(ipage,lpage);
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		}
		else if(url.equals("/insert.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/insert.jsp");
			rd.forward(request, response);
		}
		else if(url.equals("/insertproc.ws")) {
			//RequestDispatcher rd=null;
			try {
				//rd = request.getRequestDispatcher("WEB-INF/index.jsp");
				FreeBoardDTO dto = new FreeBoardDTO(
						0,
						request.getParameter("title"),
						request.getParameter("content"),
						null,
						null);
				dao.insertFreeboard(dto);
				//List<FreeBoardDTO> list = dao.selectAll();
				//request.setAttribute("list", list);
			}
			catch(Exception e) {
				//rd = request.getRequestDispatcher("WEB-INF/error.jsp");
			}
			
			//rd.forward(request, response);
			response.sendRedirect("index.ws");
		}
		else if(url.equals("/update.ws")) {
			FreeBoardDTO dto = dao.selectOne(request.getParameter("idx"));
			request.setAttribute("dto", dto);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/update.jsp");
			rd.forward(request, response);
		}
		else if(url.equals("/updateproc.ws")) {
			FreeBoardDTO dto = new FreeBoardDTO(
					Integer.parseInt(request.getParameter("idx")),
					request.getParameter("title"),
					request.getParameter("content"),
					null,
					null
					);
			
			dao.updateFreeBoard(dto);
			
			response.sendRedirect("index.ws");
		}
		else if(url.equals("/delete.ws")) {
			//RequestDispatcher rd = null;
			String[] idx = request.getParameterValues("idx");
			for(int i=0;i<idx.length;i++) {
				System.out.println("idx = "+idx[i]);
			}
			try {
				dao.deleteAll(idx);
				//List<FreeBoardDTO> list = dao.selectAll();
				//request.setAttribute("list", list);
				//rd = request.getRequestDispatcher("WEB-INF/index.jsp");
				
			} catch (Exception e) {
				//rd = request.getRequestDispatcher("WEB-INF/error.jsp");
			}
			
			//rd.forward(request, response);
			response.sendRedirect("index.ws");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
