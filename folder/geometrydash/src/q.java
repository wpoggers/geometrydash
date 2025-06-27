public class q {
    private int size;
    final private Nodejs originNode;
    public q(Nodejs originNode) {
        this.originNode = originNode;
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
        this.size++;
    }
    public void remove(int index2remove) {
        Nodejs bnexnode = this.originNode.getNextNode(); Nodejs kurentNode = this.originNode;
        kurentNode.setNextNode(bnexnode.getNextNode());
    }
}
