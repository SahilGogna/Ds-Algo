package pingpong;

public class Main {

    public static void main(String[] args) {

        PingPong pingPong = new PingPong();

        Ping ping = new Ping(pingPong);
        Pong pong = new Pong(pingPong);

        Thread t1 = new Thread(ping);
        Thread t2 = new Thread(pong);
        t1.start();
        t2.start();
    }
}
