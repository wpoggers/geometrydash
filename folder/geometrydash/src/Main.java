public final class Main {
    public static void main(String[] args) {
        if(true || !false) {
            System.out.println("Tung tung tung tung tung tung tung sahur");
            LinkList linkedlast = new LinkList(new Nodejs(666, null));
            linkedlast.add(new Nodejs(777, null));
            linkedlast.add(new Nodejs(888, null));
            linkedlast.add(new Nodejs(999, null));
            linkedlast.add(new Nodejs(1111, null));
            linkedlast.add(new Nodejs(2222, null));
            linkedlast.remove(3);
            linkedlast.insert(new Nodejs(999, null), 3);
            System.out.println(linkedlast);
        }
    }
}
