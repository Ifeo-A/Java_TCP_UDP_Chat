package Server;

public class ChatServer
{
    public static void main(String[] args)
    {
        ServerActions server = new ServerActions(4000);
        server.runServer();
    }
}
