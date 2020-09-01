package exercicio13;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;

import java.util.ArrayList;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ValidacaoesFluentes {

	@Test
	public void validacaoEqualsTo() {
		String comida = "Bife com batatas fritas";
		assertThat(comida, equalTo("Bife com batatas fritas"));
	}

	@Test
	public void validacaoIs() {
		String filme = "Black Panther";
		assumeThat(filme, is("Black Panther"));
	}
	
	@Test
	public void validacaoAnyOf() {
		String itemselecionado = "O carro preto";
		assertThat(itemselecionado, anyOf(containsString("preto"), containsString("preta")));
	}
	
	@Test 
	public void validacaoHasItem() {
		java.util.List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("Macarrão parafuso");
		listaProdutos.add("Leite integral");
		listaProdutos.add("Extrato de tomate");
		listaProdutos.add("Bife borboleta");
		
		assertThat(listaProdutos, hasItem("Leite integral"));
	}
		

}
