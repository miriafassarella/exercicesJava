package com.miria.locacao;

public class Veiculo {

    private String placa;
    private boolean disponivel = true;
    private GrupoVeiculo grupo;

    public Veiculo() {

    }

    public Veiculo(String placa, GrupoVeiculo grupo) {
	this.placa = placa;
	this.grupo = grupo;

    }

    public String getPlaca() {
	return placa;
    }

    public void getPlaca(String placa) {
	this.placa = placa;
    }

    public void isDisponivel(boolean disponivel) {
	this.disponivel = disponivel;
    }

    public boolean getDisponivel() {
	return disponivel;
    }

    public GrupoVeiculo getGrupoVeiculo() {
	return grupo;
    }

    public void setGrupoVeiculo() {
	this.grupo = grupo;
    }

}