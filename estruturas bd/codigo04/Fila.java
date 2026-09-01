public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila) {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeFila = nomeFila;
    }

    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No<T> getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public String getNomeFila() {
        return nomeFila;
    }

    public void setNomeFila(String nomeFila) {
        this.nomeFila = nomeFila;
    }
    

}
