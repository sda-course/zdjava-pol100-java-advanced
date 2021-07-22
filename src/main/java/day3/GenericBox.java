package day3;

public class GenericBox <T> {
    private double weight;
    private T content;

    public GenericBox(double weight, T content) {
        this.weight = weight;
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void clear(){
        content = null;
    }

    public boolean isPresent(){
        return content != null;
    }

    public void setContent(T content){
        this.content = content;
    }
}
