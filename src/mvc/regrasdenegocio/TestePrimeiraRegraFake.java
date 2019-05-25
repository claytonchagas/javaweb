package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestePrimeiraRegraFake implements Regra{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		System.out.println("Executando a regra de negócio fake");
		
		System.out.println("Retorno da view de response");
		
		return "testeprimeiraregrafake.jsp";
	}

}
