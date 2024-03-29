package ejemplocallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExampleCallable  {
	
	public static void main(String args[]) {
	ExecutorService executor=Executors.newSingleThreadExecutor();
	Future<Long> primo=executor.submit(new OscarCallable(189L));
	
	 try {
		System.out.println(primo.get());
	} catch (InterruptedException | ExecutionException e) {
	
		e.printStackTrace();
	}
	
	executor.shutdown();
	}
}
