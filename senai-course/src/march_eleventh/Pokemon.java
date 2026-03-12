package march_eleventh;

public abstract class Pokemon {
    private String nome;
    private String tipo;
    private int vida;
    protected int ataqueBase;

    public Pokemon(String nome, String tipo, int vida, int ataqueBase){
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
    };

    public abstract void listarAtaques();
    public abstract int atacar(Pokemon alvo, int poderEscolhido);

    public void receberDano(int dano){
        this.vida -= dano;
        if(this.vida < 0) this.vida = 0;
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vida);
    }

    public boolean estaVivo(){ return this.vida > 0;}
    public String getNome() { return this.nome;}
    public String getTipo() { return this.tipo;}
    public int getVida(){ return this.vida;}
}
