package mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.regrasdenegocio.Regra;

@SuppressWarnings("serial")
@WebServlet("/mvc")
public class Controller extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("regra");
		String nomeDaClasse = "mvc.regrasdenegocio." + param;
		try {
			Class<?> classe = Class.forName(nomeDaClasse);
			Regra logica = (Regra) classe.newInstance();
			String page = logica.execute(request, response);
			request.getRequestDispatcher(page).forward(request, response);
		} catch (Exception e) {
			throw new ServletException(
					"Exceção na execução da regra de negócio", e);
		}
	}
}