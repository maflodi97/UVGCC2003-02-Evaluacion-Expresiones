//  Stack

import java.util.Vector;

public class Pila implements iPila<String> {
    //  no se, todos estos metodos ya existen.
    //  Puse String como generic como placeholder pero ahi
    //  veremos a que lo cambiamos

    Vector<String> vec = new Vector<String>();
    //  implementacion de generics aunque solo existe un ADT.

    public void push(String obj){
        this.vec.add(obj);
    }

    public String pop(){
        if (!this.empty()){
            return this.vec.get(this.vec.size() - 1);
        } else{
            return this.vec.get(0);
        }
    }

    public String peek(){

        return this.vec.get(this.vec.size() - 1);
    }

    public boolean empty(){

        if (this.vec.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return this.vec.size();
    }

    public void crecer(int n){
        this.vec.setSize(n);
    }
}
