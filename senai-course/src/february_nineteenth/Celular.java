package february_nineteenth;

public class Celular {
    // Atributo privado que guarda o estado interno do objeto
    private int nivelBateria;

    public Celular(){
        this.nivelBateria = 50; // Bateria começa com 50%
        System.out.println("Celular criado com " + this.nivelBateria + "% de bateria.");
    }
    // Método PÚBLICO que controla a regra de carregamento

    public void carregar(int porcentagem){
        if (porcentagem > 0 ){
            this.nivelBateria += porcentagem;
            if (this.nivelBateria > 100) {
                this.nivelBateria = 100; // Trava para não passar de 100%
            }
            System.out.println("Carregando... Nível atual: " + this.nivelBateria + "%;");
        }
    }
}

