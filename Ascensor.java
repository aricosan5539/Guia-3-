import java.util.*;
import javax.swing.*;
public class Ascensor{ 
		
		private int p,pi;
		private int i;
		private String boton;
		
		
		Scanner sc= new Scanner(System.in);
		
		public void bt(){
		    
		boton=sc.next();
		
		switch (boton){
			
			case "subir":
				System.out.println( "A que piso desea subir?");
				p=sc.nextInt();
				
				if (p<=6){ for(i=1;i<=6;i+=p);
				    
				} else{
				    
					System.out.println(" piso incorrecto");}
				break;
				
		
		case "bajar":
			System.out.println( "A que piso deseas bajar?");
			p=sc.nextInt();
								
				if (p<-2){for(i=1;i<=-2;i-=p);
	
				}else{
				    
					System.out.println(" piso incorrecto");}
				break;
			
	

	}
	}
}

