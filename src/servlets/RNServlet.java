package servlets;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@SuppressWarnings("serial")
@WebServlet("/rn")
public class RNServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("regra");
		
		ClienteDao dao = new ClienteDao();
		
		if(action.equals("InsertCliente")) {
			Cliente cliente = new Cliente();
			cliente.setNome(req.getParameter("nome"));
			cliente.setEndereco(req.getParameter("endereco"));
			cliente.setEmail(req.getParameter("email"));
			
			dao.inserir(cliente);
			
			RequestDispatcher rd = req.getRequestDispatcher("/clienteinserido.jsp");
			rd.forward(req, resp);
		} else if (action.equals("GetClientes")) {
			//código para listagem de clientes
		}else if (action.equals("DeleteClientes")) {
			//código para deletar clientes			
		}
		
		//código fazendo extract class
//		if (action.equals("InsertCliente")) {
//			new InsertCliente().execute(req,resp);
//		} else if (action.equals( "GetClientes")) {
//			new GetClientes().execute(req,resp);
//		}
		
		
//		PrintWriter out = resp.getWriter();
		
//		String nome = req.getParameter("nome");
//		String endereco = req.getParameter("endereco");
//		String email = req.getParameter("email");
		
//		Cliente cliente = new Cliente();
//		cliente.setNome(nome);
//		cliente.setEndereco(endereco);
//		cliente.setEmail(email);
		
//		ClienteDao dao = new ClienteDao();
//		dao.inserir(cliente);
		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("Cliente "+cliente.getNome()+" inserido no banco!");
//		out.println("</body>");
//		out.println("</html>");
	}
}