import java.util.Scanner;


public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		System.out.println("Se dibujar� un pentagono con asteriscos");
		System.out.println("Indique el tama�o del pentagono:");
		System.out.println("1.-Peque�o     2.-Mediano 3.-Grande");
		int opcion = dato.nextInt();
		int n=opcion+2;
		String cadena;
		for(int i=0;i<n;i++){
			cadena="";
			for(int j=0;j<(n-i-1);j++)
		        cadena=cadena+" ";
		    for(int j=0;j<(2*i)+1;j++)
		        cadena = cadena + "*";
		    System.out.println(cadena);
		}
		cadena=" ";
		for(int j=0;j<(2*(n-1))-1;j++){
		    cadena = cadena + "*";
		}
		System.out.println(cadena);
	}	
}
