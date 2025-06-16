package ifsc.poo.nave.modelos;

public abstract class NaveEspacial {
    private static int count;
    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;
    protected boolean emVoo;

    static {
        count = 0;
    }

    public NaveEspacial() {
        this.id = count++;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = 0;
        this.emVoo = false;
    }

    public final int getCount() {
        return id;
    }

    public final int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public final int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public abstract String acelerar(int i);

    public abstract String frear(int i);

    public abstract String decolar();

    public abstract String pousar();


}
