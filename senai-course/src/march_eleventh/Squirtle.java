package march_eleventh;

public class Squirtle extends Pokemon{
    public Squirtle() {super ("Squirtle", "Agua",110,18);}
    @Override
    public void listarAtaques(){
        System.out.println("1 - Jato de Água (Agua)");
        System.out.println("2 - Mordida (Normal)");
    }

    @Override
    public int atacar(Pokemon alvo, int poderEscolhido) {
        int dano = 0;
        String tipoAtaque = "";
        if (poderEscolhido == 1){{
            dano = this.ataqueBase + 12;
            tipoAtaque = "Agua";
            System.out.println(this.getNome() + "usou Jato de Água");
        }} else {
            dano = this.ataqueBase;
            tipoAtaque = "Normal";
            System.out.println(this.getNome() + "usou Mordida!");


        }
        double multiplicador =  BatalhaUtils.calcularVantagem(tipoAtaque, alvo.getTipo());
        dano = (int) (dano * multiplicador); // Converte para int após o cálculo

        if (multiplicador > 1.0) System.out.println("É super efetivo!");
        if (multiplicador < 1.0) System.out.println("Não é muito efetivo...");
        alvo.receberDano(dano);
        return dano;

    }
}
