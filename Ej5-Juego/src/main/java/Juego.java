public class Juego {

    private int numeroSecreto;
    private int numeroIntentos;

    public Juego() {
        this.numeroSecreto = (int) (Math.random() * 500 + 1);
        this.numeroIntentos = 0;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public void incrementarNumeroIntentos() {
        this.numeroIntentos++;
    }

    public boolean adivinarNumero(int numero) {
        incrementarNumeroIntentos();
        return numero == this.numeroSecreto;
    }




}
