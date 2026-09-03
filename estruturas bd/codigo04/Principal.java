public class Principal{
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);

        System.out.println("Fila: " + fila.getNomeFila());
        fila.imprimeFila();

        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Fila após desenfileirar:");
        fila.imprimeFila();

       /* Integer total = 1;
        for(int i = 0; i < 5; i++){
            total *= fila.desenfileirar();
        }
        System.out.println("Total: " + total); */
    }
}