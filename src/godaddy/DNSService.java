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
public class DNSService extends InternetService {

    public DNSService(String IP) {
        super(IP);
    }

    @Override
    public void printService() {
        System.out.println(this.getIP());
        System.out.println("DNS Service");
    }
    public String getIP(String url){
        for(int o=0; o < this.ast.size(); o++){
            if(this.ast.get(o).Codigo.equalsIgnoreCase(url)){
                return this.ast.get(o).Value;
            }
        }
        return " ";
    }
}
