public class Library {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;
    private String SongName;
    private String SongArtist;


    Library (int size){
        arr = new int[size];
        this.capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item,String SongName,String SongArtist){
        System.out.println("Inserting: "+ item + "\nSong Title: " + SongName+"\nSong Artist: "+ SongArtist);
        rear = (rear+1)%capacity;
        arr[rear] =item;
        count++;
    }

    public int dequeue(){
        int x =arr[rear];
        System.out.println("Removing: "+ x );
        rear = (rear+1)%capacity;
        count--;
        return x;

    }

    public int peek(){
        return arr[front] ;

    }

    public int size(){
        return count;
    }
}
