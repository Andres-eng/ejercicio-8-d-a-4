import java.util.Scanner;
public class Promedio{
	private float nota1;
	private float nota2;
	
	public Promedio(float nota1,float nota2){
		this.nota1=nota1;
		this.nota2=nota2;
	}
	public void setNota1(float nota1){
		nota1=nota1;
	}
	public float getNota1(){
		return nota1;
	}
	public void setNota2(float nota2){
		nota1=nota2;
	}
	public float getNota2(){
		return nota2;
	}
	
	public void Calculo(){
	int nota1, nota2;
	Scanner teclado =new Scanner(System.in);
        while (nota1<1||nota1>10){
            System.out.printf("Digite nuevamente: ");
            nota1=teclado.nextInt();
        }
         while(nota2<1||nota2>10){
            System.out.printf("\nDigite nuevamente: ");
            nota2=teclado.nextInt();
        }
        float p=((nota1+nota2)/2);
        System.out.println("\nEl promedio es: \n"+p);
    }
    
}
