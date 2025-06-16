package ifsc.poo.nave.modelos;

import ifsc.poo.nave.interfaces.Blindada;

public class NaveExploradora extends NaveEspacial implements Blindada {
    private boolean holofotes;

    public NaveExploradora() {
        super();
    }

    public boolean ligarHolofotes() {
        return holofotes = true;
    }

    @Override
    public String acelerar(int i) {
        int velocidade = this.velocidadeAtual + i;
        return Integer.toString(velocidade);
    }

    public String frear(int i) {

    }

    public String decolar();

    public String pousar();
}
