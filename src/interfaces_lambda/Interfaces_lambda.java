/*
  Dimostrazione di come si possono utilizzare le interfacce che implementano un singolo metodo astratto
  tramite lambda expression.
  In questo esercizio viene implementata una semplicissima calcolatrice a due operandi. In base all'operatore passato come stringa
  ne viene restituito il risultato.
  Non vengono utilizzate istruzioni di selezione (if, else, switch, ecc.). Si utilizzano delle Map (che sono validi oggetti associativi).
  
 */
package interfaces_lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Leonardo
 */
public class Interfaces_lambda {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Float t1 = Float.parseFloat(br.readLine());
        Float t2 = Float.parseFloat(br.readLine());
        String op = br.readLine();
        Calculator.execOps(op, t1, t2);
    }

}
