
<<<<<<< HEAD

=======
>>>>>>> keh
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberJoin
 */
@WebServlet("/memberJoin.do")
public class MemberJoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		//① 클라이언트의 요청을 받는다 : 매개변수를 가져온다 ▶ HttpServletRequest
=======

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberJoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ① 클라이언트의 요청을 받는다 : 매개변수를 가져온다. ▶ HttpServletRequest
>>>>>>> keh
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		int age = Integer.parseInt(request.getParameter("age"));
		String addr = request.getParameter("addr");
		
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
<<<<<<< HEAD
		System.out.println("비밀번호 : " + pw);
=======
		System.out.println("비빌번호 : " + pw);
>>>>>>> keh
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
	}

	/**
<<<<<<< HEAD
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
=======
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
>>>>>>> keh
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
<<<<<<< HEAD
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
=======
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
>>>>>>> keh
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
