import java.io.*;
import java.net.*;
import java.util.*;
public class UDPClient
 {
   DatagramSocket ds;
   DatagramPacket dp,dp1;
   byte[ ] sendPackt;
   byte[ ] recevPackt;
   BufferedReader in;
   InetAddress ip;
   int port;
   String str;
   UDPClient()
    {
      try
       {
        
         in=new BufferedReader(new InputStreamReader(System.in));
         ip=InetAddress.getByName("localhost");
         ds=new DatagramSocket();
         
         while(true)
          {
            sendPackt=new byte[100];
            recevPackt=new byte[100];
            dp=new DatagramPacket(recevPackt,recevPackt.length);
           System.out.println("Client: ");
           str=in.readLine();
           sendPackt=str.getBytes();
           dp1=new DatagramPacket(sendPackt,sendPackt.length,ip,1456);
           ds.send(dp1);
          
           
            if(str.equals("exit"))
              System.exit(0);
            ds.receive(dp);
            String data=new String(dp.getData());
            System.out.println("Server: "+data);
         }
        }
       catch(Exception e){}
    }
 public static void main(String args[])
  {
    UDPClient s= new UDPClient();
  }
}