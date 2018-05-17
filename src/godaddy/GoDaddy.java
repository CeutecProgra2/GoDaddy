/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package godaddy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class GoDaddy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<InternetService>internetServices=new ArrayList();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do{
            System.out.println("1. Agregar servicio web");
            System.out.println("2. Agregar DNS");
            System.out.println("3. Agregar pagina web en");
            System.out.println("4. print Service");
            System.out.println("5. Salir");
            opcion= sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese IP");
                    String IP=sc.nextLine();
                    WebService e=new WebService(IP,"A");
                    internetServices.add(e);
                    break;
                case 2: 
                    System.out.println("Ingrese IP");
                    IP=sc.nextLine();
                    DNSService d = new DNSService(IP);
                    internetServices.add(d);
                    break;
                case 3:
                    System.out.println("ingrese IP");
                    IP= sc.nextLine();
                    System.out.println("Ingrese URL");
                    String URL = sc.nextLine();
                    System.out.println("Ingrese el contenido de la pagina");
                    String contenido = sc.nextLine();
                    for (int i=0; i<internetServices.size(); i++){
                        if (internetServices.get(i).getIP().equalsIgnoreCase(IP)){
                            internetServices.get(i).AddEntry(URL, contenido);
                        }
                    }
                    break;
                case 4: 
                    System.out.println("ingrese IP");
                    IP= sc.nextLine();
                    for (int i=0; i<internetServices.size(); i++){
                        if (internetServices.get(i).getIP().equalsIgnoreCase(IP)){
                            internetServices.get(i).printService();
                        }
                    }
                    break;
                case 5:
                    break;
            }
        }while(opcion != 5);
    }
    
}
