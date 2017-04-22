package com.example.visitcounter;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class VisitCounterServlet extends HttpServlet {

	int count = 0;

	public void init() {
		count = 1;
	}

	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("You have visited this page for " + count + " times.");

		count++;
	}
}
