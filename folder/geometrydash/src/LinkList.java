

public class LinkList {
    final private Nodejs originNode;
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
        size++;
    }
    public void insert(Nodejs grubhub, int index) {
        Nodejs bnexnode = this.originNode.getNextNode(); Nodejs kurentNode = this.originNode;
        for(int skib = 0; skib<index--; skib++) {
            kurentNode = bnexnode;
            bnexnode = kurentNode.getNextNode();
        }
        kurentNode.setNextNode(grubhub);
        grubhub.setNextNode(bnexnode);
    }
    public void remove(int index2remove) {
        Nodejs bnexnode = this.originNode.getNextNode(); Nodejs kurentNode = this.originNode;
        for(int ai = 0; ai<index2remove-1; ai++) {
            kurentNode = bnexnode;
            bnexnode = kurentNode.getNextNode();
        }
        kurentNode.setNextNode(bnexnode.getNextNode());
    }
    public void kill(int index) {
        Nodejs bnexnode = this.originNode.getNextNode(); Nodejs kurentNode = this.originNode;
        for(int ai = 0; ai<index-1; ai++) {
            kurentNode = bnexnode;
            bnexnode = kurentNode.getNextNode();
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
        rString += kurentNode.value()+"\n";
        return rString;
    }
}
