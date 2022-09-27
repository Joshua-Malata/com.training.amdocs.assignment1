public class Thread1 implements Runnable {

    Thread t;
    Thread1(){
        t = new Thread(this, "Thread 1");
        t.setPriority(2);
        System.out.println(t.getName()+" --> Created");
        t.start();

    }

    @Override
    public void run() {
        try{
            for(int i = 0; i < 5; i++){
               System.out.println(t.getName()+":"+i);
               Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(t.getName()+" --> Interrupted");
        }
        System.out.println("Thread1 --> Finished");
    }
}
