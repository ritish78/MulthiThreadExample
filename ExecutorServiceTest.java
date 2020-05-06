import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args){
        ExecutorService mulaService = Executors.newFixedThreadPool(1);  //Here, 1 means we are assigning single thread to the process.
        mulaService.execute(new Task1());
        mulaService.execute(new Thread(new Task2()));
        for (int i=301; i<399; i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Task 3 is done ");
        System.out.print("\n All is done ");
        mulaService.shutdown();
    }
}
