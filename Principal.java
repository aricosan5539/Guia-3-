import java.util.*;

public class Principal {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Ascensor ejecucion= new Ascensor();
	    
	    int opcion=0;
	    int p=1;
	    int i=1;
	    String boton;
	    System.out.println("Bienvenido a su Ascensor ");
	    System.out.println("en que piso esta?");
	    
	    
	 do{
	    
	    System.out.println("escriba que desea hacer,\n subir o bajar\n o 0 para salir");
	    boton=sc.next();
	    Ascensor nuevo=new Ascensor ();
	    switch (boton){
			
			case "subir":
				System.out.println("ahora usted esta en el piso:"+p++);
				
								
				
				
		
		case "bajar":
			
			System.out.println("ahora usted esta en el piso:"+p--);
									
				
			
	

	}
	        
	        
	   
}while (opcion !=0);

}
}

