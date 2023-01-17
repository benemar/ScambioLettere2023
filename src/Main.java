import javax.swing.*;

public class Main {
    public static void main(String[] args) {
/*
Inserire una frase ed effettuare lo scambio tra le lettere di posizione pari con quelle
dispari e poi ristampiamo la nuova frase

  - Implementazione: sostituiamo le vocali con il numero 8

 */
        // awt  ---> swing

     /*
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                "Eggs are not supposed to be green.",
                "Inane warning",
                JOptionPane.WARNING_MESSAGE);
    */
        System.out.println("Inserire una frase ed effettuare lo scambio tra" +
                "lettere di posizione pari con quelle dispari");

        String frase = JOptionPane.showInputDialog("Inserisci la frase")  ;
        // crfeo un array che contiene le lettere
        /*
        int dimensione = frase.length();
        char [] arrayCaratteri = new char[dimensione];
        inserisco i singoli caratteri nell'array
        for (int i = 0; i< arrayCaratteri.length ; i++){
            arrayCaratteri[i] = frase.charAt(i);
            }
         in alternativa
            */

        char caratteri []= frase.toCharArray();  // crea un array coon i singoli caratteri della stringa
        for (char carattere: caratteri  ) {
            System.out.print(carattere+"-");
        }

        // scambio le posizione
        System.out.println("\nScambio le posizioni");
        for (int i = 0; i< caratteri.length-1; i++){
         //ogni lettera di posizione pari sara scamnbiata con quella dispari
            if (i%2==0){
                // scambio le variabili
                // creo una variabile temporanea di appoggio
             char tmp = caratteri[i];  // o
             caratteri[i] = caratteri[i+1]; // g -->al posto di -->o
             caratteri[i+1 ] = tmp; // o -->al posto di --> g
            }

        }
        for (char carattere: caratteri  ) {
            System.out.print(carattere+"-");
        }

        // scambio vocali con numero 8
        for ( int i = 0 ; i< caratteri.length;i++ ) {
            if (caratteri[i] == 'a' || caratteri[i] == 'e' || caratteri[i] == 'i'
            ||caratteri[i] == 'o' || caratteri[i] == 'u'){
            caratteri[i] = '8';
            }
        }
        System.out.println();
        for (char carattere: caratteri  ) {
            System.out.print(carattere+"-");
        }
        //  usiamo uno switch per fare l'operazione di scambio vocali numero 8
        //case a:
        //case b:
        System.out.println();
        for (int i = 0; i < caratteri.length; i++) {

            switch (caratteri[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                caratteri[i] = '8';

            }
            System.out.print(caratteri[i]+"-");
        }
    }
}