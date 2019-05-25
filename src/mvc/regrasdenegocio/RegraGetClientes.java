package mvc.regrasdenegocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class RegraGetClientes implements Regra{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		List<Cliente> clientes = new ClienteDao().getClientes();
		
		req.setAttribute("clientes", clientes);
		
		return "getclientes5.jsp";
//		return "/WEB-INF/pages/getclientes5.jsp";
	}
}