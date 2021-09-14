import java.io.*;
import java.net.*;
import java.util.*;
public class UDPServer
 {
   DatagramSocket ds;
   DatagramPacket dp,dp1;
   byte[ ] sendPackt;
   byte[ ] recevPackt;
   BufferedReader in;
   InetAddress ip;
   int port;
   String str;
   UDPServer()
    {
      try
       {
        
         in=new BufferedReader(new InputStreamReader(System.in));
         ds=new DatagramSocket(1456);
         sendPackt=new byte[100];
         recevPackt=new byte[100];
         while(true)
          {
            sendPackt=new byte[100];
            recevPackt=new byte[100];
           dp=new DatagramPacket(recevPackt,recevPackt.length);
           ds.receive(dp);
           String data=new String(dp.getData());
           System.out.println("Client: " +data);
           System.out.println("Server: ");
           str=in.readLine();
           ip=dp.getAddress();
           port=dp.getPort();
           sendPackt=str.getBytes();
           dp1=new DatagramPacket(sendPackt,sendPackt.length,ip,port);
           ds.send(dp1);
           if(str.equals("exit"))
              System.exit(0);
         }
        }
       catch(Exception e){}
    }
 public static void main(String args[])
  {
    UDPServer s= new UDPServer();
  }
}