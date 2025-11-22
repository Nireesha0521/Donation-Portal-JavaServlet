
import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/Receive")
public class Receive extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Nireesha@0521");
			PreparedStatement ps = con.prepareStatement("select * from donation_table");
			ResultSet rs = ps.executeQuery();
			out.println("<html><head><link rel='stylesheet' href='styles.css'></head>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div class='container'>");
			out.println("<h1>Available Donations 📦</h1>");
			out.println("<div class='quote-box'>“We rise by lifting others.”</div>");
			out.println("<table border: '0'>");
			out.println("<tr><th>Sno</th><th>Item_name</th><th>Donar_name</th><th>Location</th><th>Action</th></tr>");
			while(rs.next()) {
				out.println("<tr>");
                out.println("<td>" + rs.getInt(1) + "</td>");
                out.println("<td>" + rs.getString(2) + "</td>");
                out.println("<td>" + rs.getString(3) + "</td>");
                out.println("<td>" + rs.getString(4) + "</td>");
                out.println("<td><a href='ReceiveStatus?sno=" + rs.getInt(1) + "'>Receive</a></td>");
                out.println("</tr>");
			}
			out.println("</table>");
			out.println("<a href = './index.html'>Back to Home</a>");
			out.println("</div>"); 
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception e) {
			out.println(e);
		}
	}

}
