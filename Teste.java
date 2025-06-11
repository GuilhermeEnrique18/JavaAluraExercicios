import java.util.Scanner;

public class Teste {
  public static void main(String args[]) {
Scanner input = new Scanner(System.in); 
		String p1,p2,p3,p4,p5; 
		int cont = 0;
		
		System.out.println("Telefonou para a vítima? S para Sim e N para não: ");
		p1 = input.next();
		
		System.out.println("Esteve no local do crime?S para Sim e N para não: ");
		p2 = input.next();

		System.out.println("Mora perto da vítima?S para Sim e N para não: ");
		p3 = input.next();

		System.out.println("Devia para a vítima?S para Sim e N para não: ");
		p4 = input.next();

		System.out.println("Já trabalhou com a vítima?S para Sim e N para não: ");
		p5 = input.next();
		
		if (p1.equals("S")) {
			cont++;
		}
		if(p2.equals("S")) {			
			cont++;
		} 
		if (p3.equals("S")) {
			cont++;
		}
		if (p4.equals("S")) {
			cont++;
		}
		if (p5.equals("S")) {
			cont++;
		}
		if (cont == 2) {
			System.out.println("Suspeita.");
		}
		if (cont > 2 && cont < 5) {
			System.out.println("Cúmplice.");
		}
		if (cont == 5) {
			System.out.println("Assassino.");
		}
		 if (cont == 0){
			System.out.println("Inocente.");
		}
		
  }
}