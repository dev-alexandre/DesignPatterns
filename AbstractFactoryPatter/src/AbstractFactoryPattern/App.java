package AbstractFactoryPattern;

import AbstractFactoryPattern.fabrica.Venda;
import AbstractFactoryPattern.fabrica.produto.FabricaCarro;
import AbstractFactoryPattern.fabrica.produto.FabricaMoto;

public class App {

    public static void main(String[] args){

        System.out.println("Vendemos uma moto");
        Venda vendaUm = new Venda(new FabricaMoto());
        vendaUm.vender();

        System.out.println("Vendemo uma Carro");
        Venda vendaDois = new Venda(new FabricaCarro());
        vendaDois.vender();

    }

}
