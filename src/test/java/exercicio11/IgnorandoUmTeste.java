package exercicio11;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class IgnorandoUmTeste {
	
	@Test
	@Ignore (value = "teste está inacabado")
	public void ignorandoUmTeste() {
		
		int idade = 15;
		
		assertEquals(idade, 15);
		
		
	}

}
