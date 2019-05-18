package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@SuppressWarnings("serial")
@WebServlet("/insertCliente")
public class InsertClienteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("nome");
		String endereco = req.getParameter("endereco");
		String email = req.getParameter("email");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setEmail(email);
		
		ClienteDao dao = new ClienteDao();
		dao.inserir(cliente);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Cliente "+cliente.getNome()+" inserido no banco!");
		out.println("</body>");
		out.println("</html>");
	}
}