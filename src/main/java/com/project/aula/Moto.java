/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.aula;

/**
 *
 * @author arthu
 */
public class Moto extends Veiculo implements Manutencao {

    private int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;

    }

    @Override
    public double calcularValorSeguro() {

        return cilindrada * 30.5f;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilindradas: "+getCilindrada());
    }
    
    
    @Override
    public String realizarManutencao() {
         return "Feita manutenção da moto";
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
