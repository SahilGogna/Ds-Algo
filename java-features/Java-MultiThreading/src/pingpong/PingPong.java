package pingpong;

public class PingPong {
    boolean flag = true;

    public synchronized void printPong(){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Pong");
        flag = true;
        notify();
    }

    public synchronized void printPing(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ping");
        flag = false;
        notify();
    }
}
