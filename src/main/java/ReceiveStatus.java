

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@WebServlet("/ReceiveStatus")
public class ReceiveStatus extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int sno = Integer.parseInt(request.getParameter("sno"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Nireesha@0521");
			PreparedStatement ps = con.prepareStatement("delete from donation_table where sno = ?");
			ps.setInt(1, sno);
			int d = ps.executeUpdate();
			out.println("<html><head><link rel='stylesheet' href='styles.css'></head>");
			out.println("<body><div class='container'>");
			out.println("<div class='quote-box'>“We all hope to see your smile.”</div>");
			if(d>0) {
				out.println("<h1>Congratulations! 🎉</h1>");
				out.println("<p>You successfully received the donation.</p>");
			}
			else {
				out.println("<h1>Oops! ❌</h1>");
				out.println("<p>Something went wrong. Try again.</p>");
			}
			out.println("<br><a href='./Home.html'>Back to Home</a>");
			out.println("</div></body></html>");
		}
		catch(Exception e) {
			out.println(e);
		}
	}

}
