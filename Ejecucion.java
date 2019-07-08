import java.util.Scanner;
	
	public class Ejecucion{
	public static void main(String []args){
		int nota1,nota2;
	Scanner teclado =new Scanner(System.in);
	
	System.out.printf("Ingrese el primer numero: ");
	nota1=teclado.nextInt();
	System.out.printf("Ingrese el segundo numero: ");
	nota2=teclado.nextInt();
	
	
Promedio obj=new Promedio(nota1 , nota2);
obj.Calculo();
	}
}