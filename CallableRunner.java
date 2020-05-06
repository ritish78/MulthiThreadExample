import java.util.concurrent.*;

class CallableTask implements Callable<String>{       //We have implemented Callable interface
    private final String name;

    public CallableTask(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);                   //The sleep time here is 1 second
        return "Hello" + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws Exception{
        ExecutorService mulaService = Executors.newFixedThreadPool(2);
        Future<String> pachiko= mulaService.submit(new CallableTask("Mero"));
        System.out.print("\n La vayo hai ta \n");
        String pachikomessage=pachiko.get();
        System.out.println(pachikomessage);
        System.out.print("\n Main completed");
        mulaService.shutdown();

    }
}
