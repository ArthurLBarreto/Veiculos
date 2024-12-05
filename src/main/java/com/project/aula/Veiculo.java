

package com.project.aula;

public abstract class Veiculo {

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

String placa;
private int ano;

public abstract double calcularValorSeguro();
public void exibirDetalhes(){
    System.out.println("Placa: "+placa+"\nAno: "+ano); 
}




    
    
    
    
}
