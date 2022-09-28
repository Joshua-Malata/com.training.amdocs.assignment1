public class waiter implements Runnable {
    q Q;
    Thread t;
    public waiter(q Q){
        this.Q = Q;
        t = new Thread(this,"waiter");
        t.start();
    }
    @Override
    public void run() {
        int i =0;
        while(i<=5){
            Q.put(i++);
        }

    }
}
