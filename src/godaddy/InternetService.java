/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package godaddy;

import java.util.ArrayList;

/**
 *
 * @author Alumnos
 */
public abstract class InternetService {
    private String IP;
    public ArrayList<ServiceEntry> ast = new ArrayList();
    
    public InternetService (String IP){
        this.IP = IP;
    }
    public String getIP(){
        return this.IP;
    }
    
    public boolean AddEntry(String key, String value){
        for(int i=0; i<this.ast.size(); i++ ){
            if (this.ast.get(i).Codigo.equalsIgnoreCase(key)){
                return false;
             
            }
        }
         ServiceEntry e = new ServiceEntry(key,value);
         this.ast.add(e);
         return true;
    }
    
    public abstract void printService();
    
}
