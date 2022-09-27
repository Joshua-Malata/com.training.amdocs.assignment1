public class thread1 implements  Runnable{
    Thread t;

    thread1(){
        t = new Thread(this, "Thread 1");
        System.out.println(t.getName()+ " --> Created");
        t.start();
    }

    @Override
    public void run() {
        try{
            Thread.sleep(6000);
            System.out.println(t.getName()+": ODD");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t.getName()+" --> Finished");
    }
}
