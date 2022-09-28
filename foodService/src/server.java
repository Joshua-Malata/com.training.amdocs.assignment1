public class server implements Runnable{

    q Q;
    Thread t;
    public server(q Q){
        this.Q = Q;
        t = new Thread(this,"server");
        t.start();
    }
    @Override
    public void run() {
        int i = 0;
        while(i==0){
            Q.get();
            i++;
        }

    }
}
