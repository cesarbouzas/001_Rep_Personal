
package pkg002_ejemplo_formato_datos_entrada_ant;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    private String Dni;
    private static final char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private char letraCalculada;
    private char letraInsertada;
public void setDni(){
      String Dniprevio="";
    Pattern formatoDNI=Pattern.compile("[0-9]{8}[a-zA-z]");
    Matcher mat=null;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Introduce el dni del Cliente :");
        Dniprevio=sc.nextLine();
        try{
        mat=formatoDNI.matcher(Dniprevio);
        if(mat.find()){
            System.out.println("Formato valido (ocho numeros + una letra)");
            int num=Integer.parseInt(Dniprevio.substring(0,8));
            int pos=num%23;
            letraCalculada=letrasDNI[pos];       
            System.out.println("La letra Calculada es : "+letraCalculada);
            letraInsertada=Dniprevio.charAt(8);
            letraInsertada=Character.toUpperCase(letraInsertada);
            System.out.println("La letra inseertada es : "+letraInsertada);
        }else{
            System.out.println("Formato no valido");
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }while(!mat.find()//&&!String.valueOf(letraCalculada).equalsIgnoreCase(String.valueOf(letraInsertada))
            );
       
        this.Dni=Dniprevio;
        System.out.println(this.Dni+" Dni Correcto");
    }
    }


