package com.miria.locacao.servico;

import com.miria.locacao.Locacao;

public class ServicoDeLocacao {

   
	public void confirmarLocacao(Locacao locacao) {

	double totalDiarias = locacao.getVeiculo().getGrupoVeiculo().getValorDiaria() * locacao.getQuantidadeDiarias();

	locacao.getVeiculo().isDisponivel(false);

	}
   
}