package com.gomes.daniel.ckn.layer.mineracao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gomes.daniel.ckn.layer.mineracao.Controller.MineracaoController;
import com.gomes.daniel.ckn.layer.mineracao.domain.infrastructure.MineracaoRepositoryImpl;
import com.gomes.daniel.ckn.layer.mineracao.domain.model.Carrefour;
import com.gomes.daniel.ckn.layer.mineracao.domain.model.DamianCenterLar;
import com.gomes.daniel.ckn.layer.mineracao.domain.model.TendaAtacado;

@Component
public class MineracaoService {
	@Autowired
	MineracaoController mineracaoController;
	
	@Autowired
	MineracaoRepositoryImpl mineracaoRepositoryImpl;
	
	
	public void salvar() {
		mineracaoController.salvar(mineracaoRepositoryImpl.minerar(new DamianCenterLar()));
		mineracaoController.salvar(mineracaoRepositoryImpl.minerar(new TendaAtacado()));
		mineracaoController.salvar(mineracaoRepositoryImpl.minerar(new Carrefour()));
		System.out.println("Mineracao Realizada");
	}
	
}
	