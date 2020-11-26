package controllers;

import estruturasDados.Tabela;
import estruturasDados.arvore.ArvoreAVL;
import services.sort.ArvoreSortService;
import services.sort.HeapSortService;
import utils.InOutArquivos;

public class ArvoreAVLController extends SuperController {

	@Override
	public void iniciaApp() {
		super.iniciaApp("ArvoreAVL");
	}

	@Override
	public void instanciaEstrutura(int nElem) {
		estrutura = new ArvoreAVL();
	}

	@Override
	public void povoaEstruturaPeloTXT(String fileName) {
		InOutArquivos.leitorTXTPessoaBanco("arquivos_in/" + fileName, (ArvoreAVL) estrutura);
	}

	@Override
	public void ordenaEstrutura() {
		Ordenacoes.SortService((ArvoreAVL) estrutura, new ArvoreSortService());
	}

	@Override
	public void geraTXTOrdenado(String fileName) {
		InOutArquivos.escritorTXTPessoaBanco((ArvoreAVL) estrutura, fileName);
	}

	@Override
	public void buscaEGeraTXTSaida(String fileName) {

		InOutArquivos.leitorTXTBusca((ArvoreAVL) estrutura, fileName);

	}

}
