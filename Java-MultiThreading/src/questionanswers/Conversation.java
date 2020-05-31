package questionanswers;

public class Conversation {
    boolean flag = true;

    public synchronized void giveAnswers(String reply) throws InterruptedException {
        if(flag){
            wait();
        }
        System.out.println(reply);
        flag = true;
        notify();
    }

    public synchronized void askQuestions(String question) throws InterruptedException {
        if(!flag){
            wait();
        }
        System.out.println(question);
        flag = false;
        notify();
    }
}
