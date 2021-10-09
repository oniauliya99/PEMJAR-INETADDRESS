/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Praktikum1 {

    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getByName("www.polinema.ac.id");
            InetAddress address2=InetAddress.getByName("114.6.41.77");
            System.out.println(""+address.getHostAddress());
            System.out.println(""+address.getHostName());
            if (address.equals(address2)) {
                System.out.println("Alamat sama");
            }else{
                System.out.println("Alamat tidak sama");
            }
        }catch(UnknownHostException ex){
            Logger.getLogger(Praktikum1.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

}
