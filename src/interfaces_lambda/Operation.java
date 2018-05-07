/*
Interfaccia Operation<T> 
Restituirà il risultato di una delle quattro operazioni in base alla implementazione del metodo getResult.
 */
package interfaces_lambda;

/**
 *
 * @author Leonardo
 * @param <T>
 */
public interface Operation<T> {
    public T getResult(T t, T t1);
}
