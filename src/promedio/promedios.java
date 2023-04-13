package promedio;

	import java.util.Scanner;
	public class promedios {

	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        int c=0;						/* Aquí se guardará el contador del ciclo FOR */
	        float n=0;						/* Aquí se guardará el valor de cada nota */
	        float ssn=0;					/* Aquí se guardará la semisuma de las notas */
	        float pn=0;						/* Aquí se almacenará el promedio */
	        System.out.println("Entre el numero de notas:");
	        int nn = sc.nextInt();			/* Aquí el programa toma la cantidad de notas a trabajar */
	        for(c=1;c<nn+1;c++){
	            do
	            {
	                Scanner vr=new Scanner(System.in);
	                System.out.println("La nota debe ser positiva y entre 1 y 7!\n");
	                System.out.println("Entre el valor de la nota "+c+":");
	                n=vr.nextFloat();		/* Para asegurarnos de no perder información, los valores de las notas las tomaremos como FLOAT desde el comienzo */
	            } while (n <1 || n > 7);				/* Este ciclo DO-WHILE es para asegurar que cada valor de las notas ingresadas sea positiva */
	            ssn+=n;					
	        }
	        pn=ssn/nn;						/* Calculamos la RESISTENCIA TOTAL */
	        System.out.println("El promedio es: "+pn);
	        if(pn<4) {System.out.println("El alumno reprobó.");}
	        else {
	        	System.out.println("El alumno aprobó.");
	        }
	    }

		
	}