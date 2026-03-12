package march_eleventh;

public class Geodude extends Pokemon{
    public Geodude() {super ("Geodude", "Pedra",130,15);}
    @Override
    public void listarAtaques(){
        System.out.println("1 - Lançamento de Rocha ( Pedra )");
        System.out.println("2 - Pancada (Normal)");
    }

    @Override
    public int atacar(Pokemon alvo, int poderEscolhido) {
        int dano = 0;
        String tipoAtaque = "";
        if (poderEscolhido == 1){{
            dano = this.ataqueBase + 10;
            tipoAtaque = "Planta";
            System.out.println(this.getNome() + "usou Lançamento de Rocha!");
        }} else {
            dano = this.ataqueBase;
            tipoAtaque = "Normal";
            System.out.println(this.getNome() + "usou Pancada!");


        }
        double multiplicador =  BatalhaUtils.calcularVantagem(tipoAtaque, alvo.getTipo());
        dano = (int) (dano * multiplicador); // Converte para int após o cálculo

        if (multiplicador > 1.0) System.out.println("É super efetivo!");
        if (multiplicador < 1.0) System.out.println("Não é muito efetivo...");
        alvo.receberDano(dano);
        return dano;

    }
}
