package controllers;

import estruturasDados.Tabela;
import services.sort.HeapSortService;
import utils.Cronometro;
import utils.InOutArquivos;

public class HeapSortBuscaBi implements InterfaceControllers {

	static Tabela tabela;

	public void iniciaApp() {
		Cronometro.iniciaCronometro();
		instanciaTabela(500);
		povoaTabelaPeloTXT();
		ordenaTabela();
		geraTXTOrdenado();
		buscaEGeraTXTSaida();
		Cronometro.paraCronometro();
	}

	public void instanciaTabela(int nElem) {
		tabela = new Tabela(nElem);
	}

	public void povoaTabelaPeloTXT() {
		InOutArquivos.leitorTXTPessoaBanco("arquivos_in\\conta500alea.txt", tabela);
	}

	public void ordenaTabela() {

		Ordenacoes.SortService(tabela, new HeapSortService());

	}

	public void geraTXTOrdenado() {
		InOutArquivos.escritorTXTPessoaBanco(tabela);
	}

	public void buscaEGeraTXTSaida() {

		InOutArquivos.leitorTXTBusca(tabela);
		
		System.out.println("Fim da execucao");
	}

}