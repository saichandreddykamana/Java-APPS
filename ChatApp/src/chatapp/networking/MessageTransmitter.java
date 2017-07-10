/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.networking;

/**
 *
 * @author saichand
 */

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saichand
 */
public class MessageTransmitter extends Thread {
 String msg, hostname, UserName;   
 int port;
 public MessageTransmitter(){
     
 }
 public MessageTransmitter(String msg, int port,String UserName)
 {
     this.msg=msg;
     this.port=port;
     this.UserName = UserName +": ";
 }
 public void run(){
     try{
     Socket s = new Socket(hostname, port);
    s.getOutputStream().write( UserName.getBytes());
     
     s.getOutputStream().write( msg.getBytes());

     s.close();
     } catch (IOException ex) {
         Logger.getLogger(MessageTransmitter.class.getName()).log(Level.SEVERE, null, ex);
     }
     }
}
