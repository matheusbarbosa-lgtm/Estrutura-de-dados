
public class Principal{
    public static void main(String[] args){
           
        Lista<String> lista = new Lista<String>("Alunos");
        lista.imprimeLista();
        lista.addInicio("Rafael");
        lista.imprimeLista();
        lista.addInicio("Gabriel");
        lista.imprimeLista();
        lista.addInicio("Daniely");
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.addFinal("Miguel");
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }
}