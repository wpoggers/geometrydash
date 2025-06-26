public final class Main {
    public static void main(String[] args) {
        if(true || !false) {
            System.out.println("Tung tung tung tung tung tung tung sahur");
            LinkList linkedlast = new LinkList(new Nodejs(666, null));
            linkedlast.add(new Nodejs(777, null));
            linkedlast.add(new Nodejs(888, null));
            System.out.println(linkedlast.size());
            System.out.println(linkedlast);
        }
    }
}
