package exercicio9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_Parametros {

	@Parameter(0)
	public String nome;
	@Parameter(1)
	public int anoDeNascimento;
	@Parameter(2)
	public String resultado;

	@Test
	public void validarObrigatoriedadeDeVoto() {

		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));

	}

	@Parameters(name = "{0}|{1}|{2}")
	public static Collection<Object[]> data() {

		return Arrays.asList(new Object[][] {
				
				{"Tatiana",2006, "Tatiana voc� n�o pode votar!"},
				{ "Allana", 2005, "Allana voc� n�o pode votar!" },
				{ "Alissia", 2004, "Alissia seu voto � facultativo!" },
				{ "Marcos Paulo", 2003, "Marcos Paulo seu voto � facultativo!" },
				{ "Claudia", 2002, "Claudia seu voto � obrigat�rio!" },
				{ "Paulo", 1995, "Paulo seu voto � obrigat�rio!" },
				{ "Gla�cia", 1950, "Gla�cia seu voto � obrigat�rio!" }, 
				{ "Elo�", 1949, "Elo� seu voto � facultativo!" }

		});
	}

}
