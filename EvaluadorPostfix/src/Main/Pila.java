//  Stack

import java.util.Vector;

public class Pila <E>
implements iPila<E> {
    //  todos estos metodos ya existen.
    //  Puse String como generic como placeholder pero ahi
    //  veremos a que lo cambiamos

    protected Vector<E> vec;
    
    public Pila() {
    	vec = new Vector<E>();
    }
    //  implementacion de generics aunque solo existe un ADT.

    @Override
    public void push(E obj){
    	//post: el objeto se agrega al final del Vector
    	
        this.vec.add(obj);
    }

    @Override
    public E pop(){
    	// pre: el Vector no está vacío 
    	// post: el último elemento "pusheado" es eliminado y mostrado.
        
    	return vec.remove( vec.size()-1)
    	/** CREO que no es necesario el If puesto que es un "pre" el que no esté vacio el stack
    	 * pero no sé,¿ que piensan ustedes?
    	if (!this.empty()){
            return this.vec.get(this.vec.size() - 1);
        } else{
            return this.vec.get(0);
            **/
        }
    }

	@Override
    public E peek(){
    	// pre: el vector no está vacío
    	// post: devuelve el valor de hasta arriba ( el siguiente a ser eliminado por "pop()" )
        return this.vec.get(this.vec.size() - 1);
    }

	@Override
    public boolean empty(){
		// post: Retorna si True si el vector está vacío

        if (this.vec.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public int size(){
    	// post: retorna el numero de elementos que hay en el vector
        return this.vec.size();
    }

    /**
     * No entiendo que hace este metodo, o para qué lo usariamos.... :/
     */
    public void crecer(int n){
        this.vec.setSize(n);
    }
}
