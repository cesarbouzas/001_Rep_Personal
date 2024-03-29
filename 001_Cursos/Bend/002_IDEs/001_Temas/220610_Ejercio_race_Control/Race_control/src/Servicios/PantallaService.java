package Servicios;

public abstract class PantallaService {
	 public static void borrar() {
	
	for(int i=0;i<90;i++) {
	
		System.out.flush();
	}
	 }

	 public static void borrar2(){
	        try{
	            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
	              
	            if(operatingSystem.contains("Windows")){        
	                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
	                Process startProcess = pb.inheritIO().start();
	                startProcess.waitFor();
	            } else {
	                ProcessBuilder pb = new ProcessBuilder("clear");
	                Process startProcess = pb.inheritIO().start();

	                startProcess.waitFor();
	            } 
	        }catch(Exception e){
	            System.out.println(e);
	        }
	    }
	

}
