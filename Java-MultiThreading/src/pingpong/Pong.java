package pingpong;

public class Pong implements Runnable{
    PingPong pong;

    Pong(PingPong pong){
        this.pong = pong;
    }

    @Override
    public void run() {
        for(int i =0 ; i<5 ; i++){
            pong.printPong();
        }
    }
}
