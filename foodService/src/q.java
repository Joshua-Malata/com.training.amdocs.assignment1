public class q {
    int n;
    boolean flag = false;
    synchronized int get(){
        if(flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Got: Ready to Serve");
        return n;
    }
    synchronized void put(int n){
        if(flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.n = n;
        flag = false;
        System.out.println("Put: Preparing dishes");
        notify();
    }
}
