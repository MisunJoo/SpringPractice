package my.examples.chat;

import java.net.Socket;

public class SocketHandler extends Thread{
    private ChatServer chatServer;
    private Socket socket;

    public SocketHandler(ChatServer chatServer, Socket socket) {
        this.chatServer = chatServer;
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("socket으로 열심히 일하자.");
    }
}
