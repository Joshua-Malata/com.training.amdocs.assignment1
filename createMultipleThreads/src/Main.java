public class Main {
    public static void main(String[] args) {
        new Thread1();
        new Thread2();
        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Main Thread: "+ i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main Thread --> Finished");
    }
}
