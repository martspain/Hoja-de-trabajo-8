/**
 * Hoja de trabajo 8
 * Algoritmos y Estructuras de Datos
 * Seccion: 30
 * Fecha de entrega: 1/04/2020
 * Interfaz PriorityQueue
 * @author Martín España
 * Ultima fecha de modificacion: 1/04/2020
 * Version: 1.0
*/

// Implementación obtenida del libro de texto en canvas (Bailey, 2007)
public interface PriorityQue<E>
{
public E getFirst();
// pre: !isEmpty()
// post: returns the minimum value in priority queue
public E remove();
// pre: !isEmpty()
// post: returns and removes minimum value from queue
public void add(E value);
// pre: value is non-null comparable
// post: value is added to priority queue
public boolean isEmpty();
// post: returns true iff no elements are in queue
public int size();
// post: returns number of elements within queue
public void clear();
// post: removes all elements from queue
}
