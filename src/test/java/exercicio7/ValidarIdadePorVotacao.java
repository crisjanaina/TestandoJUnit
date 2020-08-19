package exercicio7;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import votacao.Votacao;

public class ValidarIdadePorVotacao {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar(){
		
		assertEquals("Allana você não pode votar!", Votacao.podeVotar("Allana", 2005));
		
	}
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		
		
	assertEquals("Alissia seu voto é facultativo!", Votacao.podeVotar("Alissia", 2004));	
		
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		
		assertEquals("Marcos Paulo seu voto é facultativo!", Votacao.podeVotar("Marcos Paulo", 2003));
		
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		
		assertEquals("Claudia seu voto é obrigatório!", Votacao.podeVotar("Claudia", 2002));
	}
	
	@Test
	public void idadeIgual25Anos_VotoObrigatorio() {
		
		assertEquals("Paulo seu voto é obrigatório!", Votacao.podeVotar("Paulo", 1995));
	}
	
	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		
		assertEquals("Glaúcia seu voto é obrigatório!", Votacao.podeVotar("Glaúcia", 1950));
	}
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		
		assertEquals("Eloá seu voto é facultativo!", Votacao.podeVotar("Eloá", 1949));
	}


}
