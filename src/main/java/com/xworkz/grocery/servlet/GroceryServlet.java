package com.xworkz.grocery.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroceryServlet extends HttpServlet {
	public GroceryServlet() {
		System.out.println("GroceryServletcreated");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String Name = request.getParameter("Name");
		System.out.println("Name".concat(Name));

		String Price = request.getParameter("Price");
		System.out.println("Price:".concat(Price));

		String Type = request.getParameter("Type");
		System.out.println("Type".concat(Type));

		String Quantity = request.getParameter("Quantity");
		System.out.println("Quantity:".concat(Quantity));

		System.out.println("Starting to write response");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<html>");
		out.print("<h1>");
		out.print("Details saved for".concat(Name));
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
