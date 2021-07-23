package homework.task2;

abstract public class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    abstract public String send();

    protected boolean canSend(){
        if (content == null){
            return false;
        }
        if (content.isEmpty()){
            return false;
        }
        if (content.length() < 5){
            return false;
        }
        return true;
    }

    public String getContent() {
        return content;
    }
}
