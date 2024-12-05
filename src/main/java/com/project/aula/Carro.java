/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.aula;

/**
 *
 * @author arthu
 */
public class Carro extends Veiculo implements Manutencao {

    private int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {

        return numeroPortas * 30.5f;
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção feita do carro";
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
    System.out.println("Numero de Portas: "+getNumeroPortas()); 
}
    
}
