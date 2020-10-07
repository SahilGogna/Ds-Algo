package questionanswers;

public class Answers implements Runnable{

    Conversation conversation;
    String[] answers = {"Hiii!", "I am doing good.", "Just chilling."};

    public Answers(Conversation conversation){
        this.conversation = conversation;
    }

    @Override
    public void run() {
        for (int i = 0; i< answers.length ; i++){
            try {
                conversation.giveAnswers(answers[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
