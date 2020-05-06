import java.util.List;
import java.util.concurrent.*;
public class MultipleCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService mulaService = Executors.newFixedThreadPool(3);
        List<CallableTask> callabletask=List.of(new CallableTask("Mero"), new CallableTask("Name"), new CallableTask("Ho"));
        Future<String> pachiko = mulaService.submit(new CallableTask("My"));
        //List<Future<String>> resultOf=mulaService.invokeAll(callabletask);
        String resultOf = mulaService.invokeAny(callabletask);
        System.out.println(resultOf);
        mulaService.shutdown();               //We need to shutdown the Executor service.
    }
}
