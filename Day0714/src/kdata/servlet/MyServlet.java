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
//������������� ������ �ٽ� �����ؾ� ������� �����.
@WebServlet("/test.cbs")//url ��¥�� ����� �ִ°�. url mapping��Ű�°�. �ڹ������� ������ ���� �Ұ��ϴϱ�.
//��Ĺ�� webapp ������ war �������·� �����ؾ� ��.��Ŭ��-export-war����-> ���丮�� ��Ĺ ����������!!!
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
		response.setContentType("text/html; charset=UTF-8");//������ ���ڵ� �Ǿ����.
		PrintWriter out = response.getWriter();//���尴ü out. �� ����. �Ű������� �������ϱ�. jsp������ �� ����������.
		//�׷��� printwriter��� �� ���� ��ߵǴµ� �̸��� out���� ������൵ �ǰ� ���ŷ� �ᵵ �ǰ�
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
