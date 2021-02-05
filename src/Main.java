/*
Andrea Lam, 20102
Postfix
Hacer la simulacion de una calculadora del mecanismo de una calculadora antigua
Se hará con los conocicimientos de stacks
Java
NET.Framework
Fecha de creación : 1/02/21
Fecha de modificación1: 3/05/19
FEcha de modificación 2: 4/02/21
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main( String[] args){

        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        try {
            File file = new File("datos.txt"); //busca el archivo llamado datos
            while(scan.hasNextLine()){  //mientras tenga una siguiente linea el archivo
                try {
                    String a = scan.nextLine(); //lee la linea
                    System.out.print(a); //muestra la expresión
                    String b = calculadora.Calculo(a);//manda la expresion a la calculadora
                    System.out.println(b);// muestra el resultado
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e){
            System.out.println("No se encontro el archivo");
        }

    }
}

