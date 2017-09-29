/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py_rmi_client1.pkg0.pkg0;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import py_rmi_1.pkg0.pkg0.OperacionInterfaz;

/**
 *
 * @author DIGETI
 */
public class rmiclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionInterfaz servidorObj;
        
        String serverAddress = "192.168.1.43";
        int serverPort = 3000;
        try{
            Registry registry = LocateRegistry.getRegistry(serverAddress,serverPort);
            servidorObj = (OperacionInterfaz) (registry.lookup("operacionservidor1"));
            String a = servidorObj.correr();
            String b = servidorObj.comer();
            String c = servidorObj.volar();
            System.out.println("correr.."+a);
            System.out.println("comer.."+b);
            System.out.println("volar.."+c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
