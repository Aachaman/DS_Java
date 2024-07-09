
class QueueUsingArray{
    int front_Q, rear_Q;
    int capacityOfQueue;
    static int[] q1;

    QueueUsingArray(int size){
        capacityOfQueue=size;
        q1 = new int[capacityOfQueue];
    }

    void enqueue(int value){
        if(rear_Q==capacityOfQueue){
            System.out.println("Queue is full you can't insert.");
            
        }
        else{
            q1[rear_Q]=value;
            rear_Q++;
        }

    }

    void dequeue(){
        if (rear_Q==0){
            System.out.println("Queue is empty.");
        }
        else{
            for (int i = 0; i < rear_Q-1; i++) {
                q1[i]=q1[i+1];
            }
            rear_Q--;           
        }
    }

    void display(){
        if (rear_Q==0){
            System.out.println("Queue is empty.");
        }
        else{
            for (int i = 0; i < rear_Q; i++) {
               System.out.println(q1[i]);
            }      
        }
    }
}

public class Queueisfun {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(8);
        queue.enqueue(16);
        queue.display();
        queue.dequeue();
        queue.display();


    }
}
