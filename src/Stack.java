

public interface Stack <E>{

    public void push(E data);//para ingresar un elemento al stack
    public E  pop(); //para sacar un elemento del stack
    public boolean empty(); //ver si el stack esta vacio o no
    public E peek(); //para saber cual fue el ultimo elemento del stack
    public int size();//para saber el tamaño del stack

}
