
public class Lista<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista) {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeLista = nomeLista;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(this.primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }

    }

    public void removeInicio(){
        if(this.primeiroNo == null){
            System.out.println("Lista Vazia");
        } else{
            System.out.println("Removendo o elemento: " + this.primeiroNo.getDado());
            if (primeiroNo == ultimoNo){
                primeiroNo = null;
                ultimoNo = null;
            } else {
                primeiroNo = primeiroNo.getNextNo();
            }
        }
     }

     public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
            if(ultimoNo == null){
                primeiroNo = novoNo;
                ultimoNo = novoNo;
        }   else {
                ultimoNo.setNextNo(novoNo);
                ultimoNo = novoNo;
        }
     }

     public void removeFinal(){
        if(ultimoNo == null){
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Removendo o elemento: " + this.ultimoNo.getDado());
            if(primeiroNo == ultimoNo){
                primeiroNo = primeiroNo.getNextNo();
                ultimoNo = ultimoNo.getNextNo();
            } else {
                No<T> noAuxiliar = primeiroNo;
                while(noAuxiliar.getNextNo() != ultimoNo){
                    noAuxiliar = noAuxiliar.getNextNo();
                }
                noAuxiliar.setNextNo(null);
                ultimoNo = noAuxiliar;
            }
        }
     }

     public void imprimeLista(){
        if(this.primeiroNo == null){
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Lista de Alunos: " + this.nomeLista);
            No<T> noAuxiliar = this.primeiroNo;
            while(noAuxiliar != null){
                System.out.println(noAuxiliar.toString());
                noAuxiliar = noAuxiliar.getNextNo();
            }
        }
     }


        
    
















    public No<T> getPrimeiroNo() {
        return this.primeiroNo;
    }

    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No<T> getUltimoNo() {
        return this.ultimoNo;
    }

    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public String getNomeLista() {
        return this.nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    
}
