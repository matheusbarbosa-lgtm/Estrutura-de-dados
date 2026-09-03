public class Fila<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void setNomeFila(String nomeFila){
        this.nomeFila = nomeFila;
    }

    public String getNomeFila(){
        return this.nomeFila;
    }

    public void setPrimeiroNo(No<T> primeiroNo){
        this.primeiroNo = primeiroNo;
    }

    public No<T> getPrimeiroNo(){
        return this.primeiroNo;
    }

    public void setUltimoNo(No<T> ultimoNo){
        this.ultimoNo = ultimoNo;
    }

    public No<T> getUltimoNo(){
        return this.ultimoNo;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);

        if(this.primeiroNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else {
            this.ultimoNo.setNextNo(novoNo);
            this.ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        if(this.primeiroNo == null){
            System.out.println("Fila vazia!");
            return null;
        }
        T dado = this.primeiroNo.getDado();
        this.primeiroNo = this.primeiroNo.getNextNo();
        if(this.primeiroNo == null){
            this.ultimoNo = null;
        }
        return dado;
    }

    
    public void imprimeFila(){
        No<T> noAuxiliar = this.primeiroNo;

        while(noAuxiliar != null){
            System.out.println(noAuxiliar.getDado());
            noAuxiliar = noAuxiliar.getNextNo();
        }
    }
}