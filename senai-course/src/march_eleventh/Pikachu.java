package march_eleventh;

public class Pikachu extends Pokemon{
    public Pikachu() {super ("Pikachu", "Eletrico",90,22);}
    @Override
    public void listarAtaques(){
        System.out.println("1 - Choque do Trovão (Eletrico");
        System.out.println("2 - Ataque Rápido (Normal)");
    }

    @Override
    public int atacar(Pokemon alvo, int poderEscolhido) {
        int dano = 0;
        String tipoAtaque = "";
        if (poderEscolhido == 1){{
            dano = this.ataqueBase + 19;
            tipoAtaque = "Eletrico";
            System.out.println(this.getNome() + "usou Choque do Trovão!");
        }} else {
            dano = this.ataqueBase;
            tipoAtaque = "Normal";
            System.out.println(this.getNome() + "Ataque Rápido!");


        }
        double multiplicador =  BatalhaUtils.calcularVantagem(tipoAtaque, alvo.getTipo());
        dano = (int) (dano * multiplicador); // Converte para int após o cálculo

        if (multiplicador > 1.0) System.out.println("É super efetivo!");
        if (multiplicador < 1.0) System.out.println("Não é muito efetivo...");
        alvo.receberDano(dano);
        return dano;

    }
}
