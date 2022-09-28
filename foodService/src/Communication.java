public class Communication {
    public static void main(String[] args){
        q Q = new q();
        new waiter(Q);
        new server(Q);
        System.out.println("Served");
    }
}
