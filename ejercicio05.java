package generation.mx;

public class ejercicio05 {

	public static void main(String[] args) {
		

		    Scanner s = new Scanner();
		    System.out.print("Introduzca un número: ");//cambio de comilla de cierr ' por "
		    String ni = s.nextLine();
		    int c = ni;
		    
		    int afo = 0;
		    int noAfo = 0;
		    
		    while (ni > 0) {
			  int digito = (int)(ni % 10);
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
			  
			  ni /= 10;
		    }

		    if (afo > noAfo) {
		      System.out.println("El " + c + " es un número afortunado.");//faltaba una t en print
		    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
		   
		    
		  
		    }
		}

	}

}
