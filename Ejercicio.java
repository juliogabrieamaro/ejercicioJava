package ejercicioJava;
import javax.swing.JOptionPane;
	



	public class Ejercicio {

		 public static void main(String[] args) {
			
		String nombre =	 JOptionPane.showInputDialog("Ingrese su Nombre");
		
		
	    String apellido =	 JOptionPane.showInputDialog("Ingrese su apellido");
		
		
	    String hobbie =	 JOptionPane.showInputDialog("Ingrese su hobbie");
		
		
		String editor =  JOptionPane.showInputDialog("Editor de codigo preferido");
	    
		String sistema =  JOptionPane.showInputDialog("Sistema operativo que utiliza");
	    
		System.out.println("Mi nombre es: "+ nombre);

		System.out.println("Mi apellido es: "+ apellido);

		System.out.println("Mi hobbie es: "+ hobbie);

		System.out.println("Mi editor de codigo preferido es: "+ editor);
	    
	   System.out.println("El sistema operativo que utilizo es: "+ sistema);

	        
	    }
		
		}
