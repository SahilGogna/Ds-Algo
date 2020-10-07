package questionanswers;

public class Question implements Runnable{

    Conversation conversation;
    String[] questions = {"Hey!", "How are you?", "What are you doing these days?"};

    public Question(Conversation conversation){
        this.conversation = conversation;
    }

    @Override
    public void run() {
        for (int i = 0; i< questions.length ; i++){
            try {
                conversation.askQuestions(questions[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
