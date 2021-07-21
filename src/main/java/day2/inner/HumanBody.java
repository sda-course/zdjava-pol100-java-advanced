package day2.inner;

public class HumanBody {
    private Heart heart;

    public HumanBody(int capacity) {
        this.heart = new Heart();
        heart.capacity = capacity;
    }

    //wewnętrzna klasa niestatyczna
    public class Heart{
        private int capacity;
    }

    public void describe(){
        System.out.println("Serce o pojemności: " + heart.capacity);
    }
}
