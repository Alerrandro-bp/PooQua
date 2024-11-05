package construtores.prescricao;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exersísioHerançaCorrigido.Cliente;
import exersísioHerançaCorrigido.Perfumaria1;
import exersísioHerançaCorrigido.Produto;

class TestFarmasia {
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@BeforeEach
	void inicializar() {
		clientes.add(new Cliente("A", 0));
		clientes.add(new Cliente("B", 200));
		
        produtos.add(new exersísioHerançaCorrigido.Medicamento("M1", 5, 50, false));
        produtos.add(new Perfumaria1("P1", 5, 50));
        produtos.add(new exersísioHerançaCorrigido.Hospitalar("H1", 0, 50));
	}

	@Test
	void vendasTest() {
		
		produtos.get(0).vender(clientes.get(0), 1);
		produtos.get(1).vender(clientes.get(0), 1);
		produtos.get(2).vender(clientes.get(0), 1);
        
        assertEquals(150.0, clientes.get(0).getSaldo());
        assertEquals(4, produtos.get(0).getEstoque());
        assertEquals(4, produtos.get(1).getEstoque());
        assertEquals(-1, produtos.get(2).getEstoque());
        
        produtos.get(0).vender(clientes.get(1), 1);
        produtos.get(1).vender(clientes.get(1), 1);
        produtos.get(2).vender(clientes.get(1), 1);
        
        assertEquals(300.0, clientes.get(1).getSaldo());
        assertEquals(3, produtos.get(0).getEstoque());
        assertEquals(4, produtos.get(1).getEstoque());
        assertEquals(-2, produtos.get(2).getEstoque());
	}
}
