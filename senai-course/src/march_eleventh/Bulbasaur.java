package march_eleventh;

public class Bulbasaur extends Pokemon{
    public Bulbasaur() {super ("Bulbassaur", "Planta",120,16);}
    @Override
    public void listarAtaques(){
        System.out.println("1 - Folha Navalha (Planta)");
        System.out.println("2 - Investida (Normal)");
    }

    @Override
    public int atacar(Pokemon alvo, int poderEscolhido) {
        int dano = 0;
        String tipoAtaque = "";
        if (poderEscolhido == 1){{
            dano = this.ataqueBase + 10;
            tipoAtaque = "Planta";
            System.out.println(this.getNome() + "usou Folha Navalha!");
        }} else {
            dano = this.ataqueBase;
            tipoAtaque = "Normal";
            System.out.println(this.getNome() + "usou Investida!");


        }
        double multiplicador =  BatalhaUtils.calcularVantagem(tipoAtaque, alvo.getTipo());
        dano = (int) (dano * multiplicador); // Converte para int após o cálculo

        if (multiplicador > 1.0) System.out.println("É super efetivo!");
        if (multiplicador < 1.0) System.out.println("Não é muito efetivo...");
        alvo.receberDano(dano);
        return dano;

    }
}
