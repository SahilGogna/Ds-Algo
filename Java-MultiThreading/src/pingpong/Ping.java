package pingpong;

public class Ping implements Runnable {

    PingPong ping;

    Ping(PingPong ping) {
        this.ping = ping;
    }

    @Override
    public void run() {
        for(int i = 0 ; i< 5 ; i++) {
            ping.printPing();
        }
    }
}
