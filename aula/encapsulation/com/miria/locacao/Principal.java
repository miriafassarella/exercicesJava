package com.miria.locacao;

import com.miria.locacao.Servico.ServicoDeLocacao;

public class Principal {

   public static void main(String[] args) {
	Veiculo veiculo = new Veiculo();
	Locacao locacao = new Locacao();
	ServicoDeLocacao sl = new ServicoDeLocacao(locacao);
	GrupoVeiculo gv = new GrupoVeiculo();

   }
}