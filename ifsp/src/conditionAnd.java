
class conditionAnd {
    public static void main(String[] args)
    {
        // inicializando variavel
        int a = 10, b = 20, c = 20, d = 0;
        // Imprimindo a, b e c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        // usando AND
        // duas constantes
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("A soma é: " + d);
        }
        else
            System.out.println("Condições falsas.");
    }
}