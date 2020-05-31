package questionanswers;

public class Main {

    public static void main(String[] args) {
        Conversation conversation = new Conversation();
        Runnable r1 = new Question(conversation);
        Runnable r2 = new Answers(conversation);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
