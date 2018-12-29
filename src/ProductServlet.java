

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int pid = Integer.parseInt(request.getParameter("pId"));
		String name =request.getParameter("pName");
		int qty = Integer.parseInt(request.getParameter("pQty"));
		int price = Integer.parseInt(request.getParameter("pPrice"));
		String button = request.getParameter("insert");
		
		System.out.println("Product ID is: " + pid);
		System.out.println("Product Name is: " + name);
		System.out.println("Product Qty is: " + qty);
		System.out.println("Product Price is: " + price);
		
		
	}

}
