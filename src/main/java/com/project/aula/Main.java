
package com.project.aula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Veiculo >veiculos = new ArrayList();
        Veiculo civic = new Carro("qwert123", 2024, 4);
        Veiculo r3 = new Moto("asdfg123", 2024, 321);
        
        veiculos.add(r3);
        veiculos.add(civic);
        
        
        for(Veiculo v : veiculos){
            v.exibirDetalhes();
            System.out.println("Seguro: "+v.calcularValorSeguro());
            
            
            System.out.println(v instanceof Manutencao? ((Manutencao) v).realizarManutencao():" ");
            
            
            
        }
        
    }
}
