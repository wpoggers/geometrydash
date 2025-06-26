public class Nodejs {
    private int value;
    private Nodejs next;
    public Nodejs(int value, Nodejs next) {
        this.value = value;
        this.next = next;
    }
    public Nodejs getNextNode() {return this.next;}

    public int value() {return this.value;}

    public void setNextNode(Nodejs next) {this.next = next;}

    public void setValue(int value) {this.value = value;}
    
    public String toString() {
        return ""+this.value;
    }
}
