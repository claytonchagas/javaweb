package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class RegraDeleteClientes implements Regra{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Long id = Long.parseLong(req.getParameter("id"));
		
		Cliente cliente = new Cliente();
		cliente.setId(id);
		
		ClienteDao dao = new ClienteDao();
		dao.excluir(cliente);
		
		System.out.println("Deletando cliente");
		
		return "getclientes4.jsp";
	}
}