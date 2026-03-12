package march_eleventh;

public class BatalhaUtils {
    public static double calcularVantagem(String tipoAtaque, String tipoAlvo){
        if ((tipoAtaque.equals("Fogo") && tipoAlvo.equals("Planta")) ||
                (tipoAtaque.equals("Agua") && tipoAlvo.equals("Fogo")) ||
                        (tipoAtaque.equals("Planta") && tipoAlvo.equals("Agua")) ||
                                (tipoAtaque.equals("Eletrico") && tipoAlvo.equals("Agua"))||
                                        (tipoAtaque.equals("Planta") && tipoAlvo.equals("Pedra"))||
                                                (tipoAtaque.equals("Agua") && tipoAlvo.equals("Pedra"))) {
            return 2.0; // Super efetivo
        }

        if ((tipoAtaque.equals("Agua") && tipoAlvo.equals("Planta")) ||
                (tipoAtaque.equals("Fogo") && tipoAlvo.equals("Agua")) ||
                (tipoAtaque.equals("Fogo") && tipoAlvo.equals("Pedra")) ||
                (tipoAtaque.equals("Eletrico") && tipoAlvo.equals("Planta"))||
                (tipoAtaque.equals("Eletrico") && tipoAlvo.equals("Pedra")))
        {
            return 0.5; // Não é muito efetivo
        }

        return 1.0; // Dano normal

    }
}
