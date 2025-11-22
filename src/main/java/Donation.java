
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

@WebServlet("/Donation")
public class Donation extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String item_name = request.getParameter("item_name");
		String donar_name = request.getParameter("donar_name");
		String location = request.getParameter("location");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Nireesha@0521");
			PreparedStatement ps = con.prepareStatement("insert into donation_table(item_name, donar_name, location)values(?, ?, ?) ");
			ps.setString(1, item_name);
			ps.setString(2, donar_name);
			ps.setString(3, location);
			int d = ps.executeUpdate();
			out.println("<html><head><link rel='stylesheet' href='styles.css'></head>");
			out.println("<body><div class='container'>");
			out.println("<div class='quote-box'>“Helping one person might not change the world, but it could change the world for one person.”</div>");
			if(d>0) {
				out.println("<h1>Congratulations! 🎉</h1>");
				out.println("<p>You Donation is successful! Thank you so much for your kindness..</p>");
			}
			else {
				out.println("<h1>Oops! ❌</h1>");
				out.println("<p>Something went wrong. Try again.</p>");
			}
			out.println("<a href = './Home.html'>Back to Home</a>");
			out.println("</div></body></html>");
		}
		catch(Exception e) {
			out.println(e);
		}
	}

}
