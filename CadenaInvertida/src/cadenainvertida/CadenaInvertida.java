//Laboratorio #2
//Programación II
//Carlos Edgardo Sagastume - 61721058
package cadenainvertida;

public class CadenaInvertida {

    public static void main(String[] args) {
     	String str = "Programación II ";
		System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
    }
    
}
