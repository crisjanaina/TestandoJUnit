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
				
				{"Tatiana",2006, "Tatiana você não pode votar!"},
				{ "Allana", 2005, "Allana você não pode votar!" },
				{ "Alissia", 2004, "Alissia seu voto é facultativo!" },
				{ "Marcos Paulo", 2003, "Marcos Paulo seu voto é facultativo!" },
				{ "Claudia", 2002, "Claudia seu voto é obrigatório!" },
				{ "Paulo", 1995, "Paulo seu voto é obrigatório!" },
				{ "Glaúcia", 1950, "Glaúcia seu voto é obrigatório!" }, 
				{ "Eloá", 1949, "Eloá seu voto é facultativo!" }

		});
	}

}
