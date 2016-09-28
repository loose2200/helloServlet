package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자가 입력한 폼 데이터를 읽어들임
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//비즈니스 로직을 수행하는 부분
		
		PrintWriter out = response.getWriter();
		
		//HTML 코드 생성
		String htmlResponse="<html>"; //스트링에다가 html문서 수행을 집어넣고 
		
		htmlResponse+= "<h2> Your name is : " + username + "<br/>";
		htmlResponse+= "Your password is : " + password + "<h2>";
		htmlResponse+= "</html>";
		
		out.println(htmlResponse); //출력하게 되면 클라이언트에 보내지고 볼수있게됨					
	}

}
