/*
Andrea Lam, 20102

Clase en la cual realizare los calculos de los numeros y operadores

Fecha de creación : 1/02/21
Fecha de modificación1: 3/05/19
FEcha de modificación 2: 4/02/21

Referencias:
http://lineadecodigo.com/java/obtener-un-caracter-de-una-cadena-con-java/
https://www.javatpoint.com/java-char-to-string
https://www.javatpoint.com/java-char-to-int
*/

public class Calculadora implements CalculadoraGeneral {

    public Stack<Integer> stack;
    public String numeros=("0123456789");

    @Override
    public String Calculo(String a)
    {
        stack = new StackVector<Integer>();

        try
        {
            for (int i=0; i<a.length(); i++)
            {
                char caracter = a.charAt(i);//obtiene el caracter

                //comparar si es un numero o un operador
                if(numeros.contains(String.valueOf(caracter))) //si es un numero
                {
                    stack.push(Character.getNumericValue(caracter)); //se guarda en el stack
                }
                else
                {
                    if(stack.empty() == false)
                    {
                        int num1=stack.pop();
                        int num2=stack.pop();

                        switch (caracter)
                        {
                            case '+':
                                stack.push(num1 + num2);
                                break;
                            case '-':
                                stack.push(num1 - num2);
                                break;
                            case '*':
                                stack.push(num1 * num2);
                                break;
                            case '/':
                                stack.push(num1 / num2);
                                break;
                            default:
                                System.out.println("A ocurrido un error en el ingreso de datos");
                                System.out.println("Porfavor no divida dentro de 0");

                        }
                    }
                }
            }

        }catch (Exception e)
        {
            System.out.println("No se pudo realizar el calulo por error: "+ e);
        }

        return a;
    }


}
