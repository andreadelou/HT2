/*
Andrea Lam, 20102

Clase en la cual se realiza las acciones del Stack

Fecha de creación : 1/02/21
Fecha de modificación1: 3/05/19
FEcha de modificación 2: 4/02/21

Referencias:
https://stackoverflow.com/questions/56615055/how-do-i-implement-the-push-pop-peek-methods-for-an-inverse-array

*/


import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    public Vector<E> data;

    /*
    Se inicializa un nuevo vector cada vez que se llama a stack para que en
    cada nueva lectura de linea no se tenga que estar borrando lo que "ya posee el stack"
    o por si quedo algun simbolo restante en el stack
     */
    public StackVector()
    {
        this.data = new Vector<E>();
    }

    @Override
    public int size() //saber el tamaño del stack
    {
        return data.size();
    }

    @Override
    public boolean empty()//verificar si el stack esta vacio
    {
        return data.isEmpty();
    }

    @Override
    public void push(E num) //agregar un elemento al stack
    {
        data.add(num);
    }

    @Override
    public E  pop()//eliminar un elemento del stack
    {
        if(data.isEmpty())
        {
            return null;
        }
        else
        {
            E a = data.get(size()-1);//obtiene el ultimo elemento
            data.remove(size()-1); //borra el ultimo elemento
            return a; //regresa el ultimo elemento
        }
    }



    @Override
    public E peek()// saber el ultimo elemento del stack
    {
        if(data.isEmpty())
        {
            return null;
        }
        else
        {
            return data.get(size()-1); //regresa el ultimo elemento
        }
    }


}
