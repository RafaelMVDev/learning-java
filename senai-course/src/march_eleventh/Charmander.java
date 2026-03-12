package march_eleventh;

import java.security.PublicKey;

public class Charmander extends Pokemon {

    public Charmander() {super ("Charmander", "Fogo",100,20);}
    @Override
    public void listarAtaques(){
        System.out.println("1 - Lança-Chamas (Fogo)");
        System.out.println("2 - Garra (Normal)");
    }

    @Override
    public int atacar(Pokemon alvo, int poderEscolhido) {
        int dano = 0;
        String tipoAtaque = "";
        if (poderEscolhido == 1){{
            dano = this.ataqueBase + 15;
            tipoAtaque = "Fogo";
            System.out.println(this.getNome() + "usou Lança-Chamas!");
        }} else {
            dano = this.ataqueBase;
            tipoAtaque = "Normal";
            System.out.println(this.getNome() + "usou Garra!");


        }
        double multiplicador =  BatalhaUtils.calcularVantagem(tipoAtaque, alvo.getTipo());
        dano = (int) (dano * multiplicador); // Converte para int após o cálculo

        if (multiplicador > 1.0) System.out.println("É super efetivo!");
        if (multiplicador < 1.0) System.out.println("Não é muito efetivo...");
        alvo.receberDano(dano);
        return dano;

    }

}
