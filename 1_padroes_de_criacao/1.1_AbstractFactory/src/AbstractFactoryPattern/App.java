package AbstractFactoryPattern;

import AbstractFactoryPattern.fabrica.Venda;
import AbstractFactoryPattern.fabrica.produto.FabricaCarro;
import AbstractFactoryPattern.fabrica.produto.FabricaMoto;

public class App {

    public static void main(String[] args){

        System.out.println("Foi Vendido uma moto");
        Venda vendaUm = new Venda(new FabricaMoto());
        vendaUm.vender();

        System.out.println("Foi Vendido um Carro");
        Venda vendaDois = new Venda(new FabricaCarro());
        vendaDois.vender();

    }

}
