package exercicio2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacaoVerdadeiroFalso {
	
	@Test
	public void validacaoVerdadeiro_Sucesso() {
		
		boolean campoEstaPresente = true;
		assertTrue (campoEstaPresente);
		
		
	}
	
	@Test
	public void validacaoVerdadeiro_Falha() {
		
		boolean campoEstaPresente = true;
		assertFalse ("Campo n�o est� presente",campoEstaPresente);
		
		
	}

}
