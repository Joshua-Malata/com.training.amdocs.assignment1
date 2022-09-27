public class Main {
    public static void main(String[] args){
    new thread1();
        try{
            for(int i = 0; i < 5; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main Thread Finished");
    }
}
