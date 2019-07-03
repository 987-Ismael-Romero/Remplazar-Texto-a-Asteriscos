import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainClass {
    /*
        Autor: Gustavo Ismael Romero Morales
        Fecha: 03 / 07 / 2019

        Nombre: Remplazar entrada de texto por cadena de Asteriscos

     */
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);        //Se iniciaiza el escaner para capturar la entrada

        String abc = "abcdefghigklmnopqrstuvwxyz";       //Cadena de texto con el Abecedario para posteriormente descomponerlo a Char

        /*
            Creo un arreglo de lista de tipo Character para
            almacenar la descomposicion del String abc
            Se obtine el caracter en la iteracion i
            Se Guarda en el Arreglo ArrayPack
         */
        ArrayList<Character> ArrayPack = new ArrayList<>();
        for(int i = 0; i < abc.length(); i++) {
            char  charAbc = abc.charAt(i);
            ArrayPack.add(i, charAbc);
        }
        //System.out.println(ArrayPack); imprime los valores de ArrayPack


        System.out.println("Ingresa la cadena de texto a convertir en *");          //Solicita al usuario la entra de texto
        String Input = scanner.nextLine();                                          //se Guarda la entrad en la variable input


        /*
                se descompone la entrada suministrada por el usuario para
                guardar sus caracteres individualmente en otro arreglo de lista
                con nombre listOFDate
         */
        ArrayList<Character> listOFData = new ArrayList<>();
        for(int i = 0; i < Input.length(); i++){
            char inputChar = Input.charAt(i);
            listOFData.add(i, inputChar);
        }



        /*
            Creo un Map para realizar un Arreglo a nivel asociativo
            en el cual cada letra del abecedario obtenido de la variable de entrada
            de (abc), sea puesto como su nombre de referencia,

            posterior a ello con la variable (cadena) se incrementa en 1 por interacion
            ejmplo:
                la letra a por estar en posicion 0 le corresponde un *
                la letra b por estar en posicion 1 le corresponde dos **
                 ...
            todo esto en funcion del tamaño de la variable abc
         */

        String Cadena = "*";

        Map<Character, String> Converion = new HashMap<Character, String>();
        for(int i = 0; i < abc.length(); i++){
            char charAbcC = abc.charAt(i);

            Converion.put(charAbcC, Cadena);
            Cadena = Cadena+"*";
        }




        //System.out.println(listOFData);  Imprime los valores de listOFDate

        /*
            Ciclo de validacion

            En este ciclo se validan todas las listas para poder obtener el valor resultante
            en asteriscos
        */

        for (int i = 0; i < listOFData.size(); i++){
            char obtenidoData = listOFData.get(i);
            for(int j = 0; j < ArrayPack.size(); j++){
                char obtenidoPack= ArrayPack.get(j);
                if (obtenidoData == obtenidoPack){
                    System.out.println( Converion.get(obtenidoData));   //Se imprime el valor de la posicion que corresponde al valor de list of data
                }else{
                    continue;
                }
            }
        }
    }
}
