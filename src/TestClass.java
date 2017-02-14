import java.util.Random;


public class TestClass {

	public static void main(String[] args) {
		//stackArrayTest();
		//stackTest();
		queueTest();
		
		
		
		
		
	}
	
	public static void queueTest() {
		//QueueInterface<Integer> tempQ = new QueueArray<>();
		//QueueInterface<Integer> tempQ = new QueueNode<>();
		QueueInterface<Integer> tempQ = new DEQueue<>();
		
		System.out.print("queue 12: ");
		for (int i = 0; i < 12; i++){
			int t = new Random().nextInt(100);
			tempQ.enqueue(t);
			System.out.print(t+ " ");

		}
		System.out.println();
		
		System.out.print("queueFront 12: ");
		for (int i = 0; i < 12; i++){
			int t = new Random().nextInt(100);
			tempQ.enqueueFront(t);
			System.out.print(t+ " ");
		}
		System.out.println();
		
		System.out.print("dequeue 12: ");
		for (int i = 0; i < 12; i++){
			System.out.print(tempQ.dequeue()+ " ");
		}
		System.out.println();
		
		System.out.print("queue 5: ");
		for (int i = 0; i < 7; i++){
			int t = new Random().nextInt(100);
			tempQ.enqueue(t);
			System.out.print(t+ " ");
		}
		System.out.println();
		
		System.out.print("dequeue all: ");
		for (int i = 0; i < 20; i++){
			System.out.print(tempQ.dequeue()+ " ");
		}
		
	}
	
	
}
