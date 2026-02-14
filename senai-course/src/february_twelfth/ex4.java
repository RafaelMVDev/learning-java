package february_twelfth;

public class ex4 {
    public static void main(String[] args) {
        char[][] t = {
                {'X','X','X'}, // jogador X e Jogador O (Ó)
                {'O','O',' '},
                {' ',' ',' '}
        };
        if (venceu(t,'X')) System.out.println("X venceu!");
        else if (venceu(t,'O')) System.out.println("O venceu");
        else System.out.println("Empate!");


    }
    static boolean venceu(char[][] t, char j){
        for (int i = 0; i <3; i++){
            if ((t[i][0] == j && t[i][1] == j && t[i][2] == j) ||
                (t[0][i] == j && t[1][i] == j && t[2][i] == j)){
                return true;
            }

        }
        return ((t[0][0] == j && t[1][1] == j && t[2][2] == j) ||
                (t[0][2] == j && t[1][1] == j && t[2][0] == j));
    }
}
