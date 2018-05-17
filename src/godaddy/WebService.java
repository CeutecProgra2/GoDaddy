/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package godaddy;

/**
 *
 * @author Alumnos
 */
public class WebService extends InternetService{
    
    public String Dominio;
                
    
    
        
    public WebService(String IP, String Dominio) {
        super(IP);
        this.Dominio=Dominio;
    }

    @Override
    public void printService() {
        System.out.println(this.getIP());
        System.out.println(this.Dominio);
        System.out.println(  "Web Service: ");
        
        for(int a =  0; a < this.ast.size(); a++){
            System.out.println(this.ast.get(a).Codigo);            
            
        }
       
        
    }
   public String getWebPage(String url){
       for(int e = 0; e < this.ast.size(); e++){
           if(this.ast.get(e).Codigo.equalsIgnoreCase(url)){
               return this.ast.get(e).Value;
           }
       }
       
       return "PAGE NOT FOUND";
   } 
   
}
