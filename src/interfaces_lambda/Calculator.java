/*
Viene istanziata una HashMap<> (Implementazione di Map).
La chiave della mappa è un oggetto di tipo String e rappresenta uno dei quattro operatori (eccezioni ed errori vari non gestiti per semplicità).
Ogni record della HashMap è un'implementazione dell'interfaccia Operation con il relativo metodo. In base alla chiave quindi in base all'operatore,
viene implementato il risultato che il metodo (l'unico metodo) di Operation deve restituire.

 */
package interfaces_lambda;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leonardo
 */
public class Calculator {
    public static void execOps(String op, Float t1, Float t2){
        
        Map<String, Operation<Float>> mapOps = new HashMap<>();
        mapOps.put("+", (Float t3, Float t4) -> t3 + t4); // new Operation<Float>(){return t3+t4}
        mapOps.put("-", (Float t3, Float t4) -> t3 - t4);
        mapOps.put("*", (Float t3, Float t4) -> t3 * t4);
        mapOps.put("/", (Float t3, Float t4) -> t3 / t4);
        
        Operation opImp = mapOps.get(op);//richiamato il metodo
        System.out.println(opImp.getResult(t1, t2));
        
    }
}
