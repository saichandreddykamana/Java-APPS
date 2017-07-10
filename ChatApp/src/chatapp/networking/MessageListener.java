/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.networking;


   import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saichand
 */
public class MessageListener extends Thread {
    
    ServerSocket server;
    int portNo = 8675 ;
    WritableGUI gui;
    public MessageListener(WritableGUI gui, int portNo){
        this.portNo = portNo;
        this.gui=gui;
        try{
            server = new ServerSocket(portNo);
        }
        catch(IOException ex)
        {
              Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public MessageListener(){
        try
        {
        server = new ServerSocket(portNo);
        }
        catch(IOException ex)
        {
              Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run(){
        Socket clientSocket;
        try
        {
            while((clientSocket = server.accept())!= null)
            {
                InputStream is = clientSocket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                
                String text = br.readLine();
                
                if(text != null)
                {
                    gui.write(text);
                }
            
            }
        } catch (IOException ex) {
            Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


