


public class LinkList {
    private Nodejs originNode;
    private int size;
    public LinkList(Nodejs originNode) {
        this.originNode = originNode;
        size = 1;
    }
    public void add(Nodejs grubhub) {
        Nodejs bnexNode = this.originNode.getNextNode(); Nodejs kurentNode = this.originNode;
        while
        (bnexNode != null) 
        {
            kurentNode = bnexNode;
            bnexNode = kurentNode.getNextNode();
        }
        kurentNode.setNextNode(grubhub);
    }
    public void remove(Nodejs grubhub, int gghg) {
        if(size==gghg) {
            grubhub.setNextNode(null);
        } else {
            remove(grubhub, gghg+1);
        }
    }
    
    public int size() {return this.size;}
    
    public String toString() {
        String rString = ""; Nodejs bnexNode = this.originNode.getNextNode(); Nodejs kurentNode = this.originNode;
        while
        (bnexNode != null) 
        {
            rString = rString + kurentNode.value()+"\n";
            kurentNode = bnexNode;
            bnexNode = kurentNode.getNextNode();
        }
        return rString;
    }
}
