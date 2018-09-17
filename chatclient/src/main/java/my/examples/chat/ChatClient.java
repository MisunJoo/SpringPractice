package my.examples.chat;

import java.net.Socket;

public class ChatClient extends Thread{
    private String ip;
    private int port;
    private String name;

    public ChatClient(String ip, int port){
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        Socket socket = null;
        try{
            socket = new Socket(ip, port);

        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            try{ socket.close(); }catch(Exception e){}
        }
    } // run
}