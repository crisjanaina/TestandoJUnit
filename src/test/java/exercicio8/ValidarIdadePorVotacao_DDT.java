package exercicio8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {
	
	String nome;
	int anoDeNascimento;
	String resultado;
	
	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento,String resultado) {
		
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
		
	}
	
	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultado,Votacao.podeVotar(nome, anoDeNascimento));
		
	}
	
	@Parameters(name = "{0} | {1} |{2}")
	public static Collection<Object[]> data(){
		
	return Arrays.asList(new Object[][] {
		{"Tatiana",2006, "Tatiana voc� n�o pode votar!"},
		{"Allana", 2005,"Allana voc� n�o pode votar!"},
		{"Alissia", 2004,"Alissia seu voto � facultativo!"},
		{"Marcos Paulo", 2003,"Marcos Paulo seu voto � facultativo!"},
		{"Claudia", 2002,"Claudia seu voto � obrigat�rio!", },
		{"Paulo", 1995,"Paulo seu voto � obrigat�rio!"},
		{"Gla�cia", 1950, "Gla�cia seu voto � obrigat�rio!"},
		{"Elo�", 1949,"Elo� seu voto � facultativo!"}
	
	});
	
	
	}
	

}
