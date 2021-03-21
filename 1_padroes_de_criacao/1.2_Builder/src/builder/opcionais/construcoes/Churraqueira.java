package builder.opcionais.construcoes;

import builder.opcionais.variacoes.Material;

public class Churraqueira {

    private Material material;

    public Churraqueira(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
