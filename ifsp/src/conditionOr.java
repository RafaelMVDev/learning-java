public class conditionOr {
    public static void main(String[] args)
    {
        // inicializando variavel
        int a = 10, b = 1, c = 10, d = 30;
        // Imprimindo a, b e c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        System.out.println("Var4 = " + d);
        // usando a logica OU para verificar
        // duas constantes
        if (a > b || c == d)
            System.out.println(
                    "Uma ou ambas as condições são verdadeiras.");
        else
            System.out.println(
                    "Ambas + condições são falsas.");
    }
}
