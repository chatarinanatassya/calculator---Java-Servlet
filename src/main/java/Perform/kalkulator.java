package Perform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/convertDecimal")
public class kalkulator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.println("<center>");
            int decimalInput = Integer.parseInt(request.getParameter("decimalInput"));

            // Konversi ke biner, oktal, dan heksadesimal
            String binary = Integer.toBinaryString(decimalInput);
            String octal = Integer.toOctalString(decimalInput);
            String hexadecimal = Integer.toHexString(decimalInput);

            out.println("<h3>Decimal: " + decimalInput + "</h3>");
            out.println("<h3>Binary: " + binary + "</h3>");
            out.println("<h3>Octal: " + octal + "</h3>");
            out.println("<h3>Hexadecimal: " + hexadecimal + "</h3>");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            out.println("<br>");
            out.println("Back to main page <a href=index.html> click here </a>");
            out.println("</center>");
        }
    }
}
