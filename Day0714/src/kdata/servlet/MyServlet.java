package kdata.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//변경사항있을시 서버를 다시 시작해야 변경사항 적용됨.
@WebServlet("/test.cbs")//url 가짜로 만들어 주는거. url mapping시키는거. 자바파일은 웹에서 접속 불가하니깐.
//톰캣에 webapp 폴더에 war 파일형태로 저장해야 됨.우클릭-export-war파일-> 디렉토리는 톰캣 웹앱폴더로!!!
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("MyServlet()");
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service()");
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet()");
		response.setContentType("text/html; charset=UTF-8");//무조건 인코딩 되어야함.
		PrintWriter out = response.getWriter();//내장객체 out. 은 못씀. 매개변수로 못받으니깐. jsp에서는 걍 쓸수있지만.
		//그래서 printwriter라는 걸 만들어서 써야되는데 이름은 out으로 만들어줘도 되고 딴거로 써도 되고
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		out.print(num);
		out.print(name);
		System.out.println(name);
		out.print("first servlet");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost()");
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
/*		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		out.print(num);
		out.print(name);
		System.out.println(name);*/
	}

}
