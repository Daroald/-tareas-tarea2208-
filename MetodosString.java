/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstring;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class MetodosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        String aux, str, substr;
        char ch;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Ejecutando Programa....");
            do {
                System.out.println("Quiere Salir? : ");
                System.out.println("1-Si");
                System.out.println("2-No");
                aux = s.nextLine();
            } while (!esNumero(aux));
            op = Integer.parseInt(aux);
            str=leerString();
            ch=leerChar();
            substr=leerSubString();
            imprimirResultados(str, ch, substr);

        } while (op != 1);
    }

    public static boolean esNumero(String aux) {
        int n;//Define una variable n como numero entero.
        try {
            n = Integer.parseInt(aux);//intentara parsear la variable aux para ver si es entera
            return (true);//retornara verdadero si lo logra
        } catch (Exception ex) {
            return (false);//retornara falso si no lo logra
        }
    }

    public static String leerString() {
        Scanner s = new Scanner(System.in);// Se define la variable s para ocuparla para ingresar datos con el metodo Scanner
        String str;// Se define una variable String str
        do {
            System.out.println("Ingrese Cadena");
            str = s.nextLine();// Se le asigna a la variable str algun dato ingresado con el metodo Scanner
        } while (str.length() == 0);
        return (str);// Retorna la variable la variable str con el ultimo valor asignado
    }

    public static char leerChar() {
        Scanner s = new Scanner(System.in);
        char c;
        String aux;
        do {
            System.out.println("Ingrese Caracter (char)");
            aux=s.nextLine();
        } while (aux.length() == 0 || aux.length()>1);
        c=aux.charAt(0);
        return(c);
    }
    
    public static String leerSubString(){
        Scanner s = new Scanner(System.in);// Se define la variable s para ocuparla para ingresar datos con el metodo Scanner
        String str;// Se define una variable String str
        do {
            System.out.println("Ingrese SubCadena");
            str = s.nextLine();// Se le asigna a la variable str algun dato ingresado con el metodo Scanner
        } while (str.length() == 0);
        return (str);// Retorna la variable la variable str con el ultimo valor asignado
    }

    public static int largoCadena(String str) {
        int n;// Se define una variable n como numero entero
        n = str.length();// Se le asigna a la variable n el valor del largo del String str
        return (n);// retorna la variable n con el ultimo valor asignado
    }

    public static int contarVocales(String str) {
        int cnt = 0;// Se define una variable "cnt" como numero entero y este servira como contador
        for (int i = 0; i < str.length(); i++) {//se inicia un ciclo "for" para analizar los caracteres de la variable String str
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                cnt++;//si se detecta uno de los caracteres de interes en la pocicion del apuntador, se dara la instruccion de sumarle 1 al contador
            }
        }
        return (cnt);// Retorna el contador cnt con el valor buscado
    }

    public static int contarConsonantes(String str) {
        int ac = str.length();// Se define una variable "ac" como numero entero y este serivira como contador, aqui se asigna que tenga el valor del largo del String str
        for (int i = 0; i < str.length(); i++) {// Se inicia un ciclo "for" para analizar la variable String str
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                ac--;// Si en la posicion del apuntador se encuentra una de las vocales de interes se dara la instruccion de restar al contador 1,dado que se tomara que hay una consonante menos del total supuesto
            }
        }
        return (ac);// Se retorna el contador con el valor buscado
    }

    public static String invertirString(String str) {
        String s = "";//Se define una variable tipo String s con un valor "vacio" para ir almacenando las letras del String str
        for (int i = str.length() - 1; i >= 0; i--) {// Se inicia el ciclo "for" para ir revisando la variable String str,comenzando desde el final llendo hacia el inicio del String str
            s = s + str.charAt(i);//A medida que el apuntador se encuentra en una pocicion, la letra de esa pocicion se le ira "sumando" a la variable "s", cosa que vaya formando la palabra invertida
        }
        return (s);// Retorna la variable String "s" con el valor deseado
    }

    public static boolean existeChar(String str, char ch) {
        int cnt2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                cnt2++;
            }
        }
        if (cnt2 > 0) {
            return (true);
        } else {
            return (false);
        }
    }

    public static boolean existeSubString(String str, String substr) {
        if (str.contains(substr)) {
            return (true);
        } else {
            return (false);
        }
    }

    public static char[] crearArrayChar(String str) {
        char[] c = new char[str.length()];
        for (int i = 0; i < c.length;i++) {
            c[i] = str.charAt(i);
        }
        return (c);
    }

    public static void imprimirResultados(String str, char ch, String substr) {
        char[] c= crearArrayChar(str);
        System.out.println("El largo de la cadena es: " + largoCadena(str));
        System.out.println("La cantidad de vocales es: " + contarVocales(str));
        System.out.println("La cantidad de consonantes es: " + contarConsonantes(str));
        System.out.println("La cadena invertida es: " + invertirString(str));
        System.out.print("Existe el caracter?: " );
        if(existeChar(str, ch)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        System.out.print("Existe la subcadena?: ");
        if(existeSubString(str, substr)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        System.out.print("El contenido del arreglo tipo caracter es: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(c[i] + ",");
        }
        System.out.println("\b");
    }
}
