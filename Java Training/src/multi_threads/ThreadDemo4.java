package multi_threads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		Set<Callable<String>> tasks = new HashSet<>();

		Callable<String> task1 = () -> "Task1";
		Callable<String> task2 = () -> "Task2";
		Callable<String> task3 = () -> "Task3";
		
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);

		List<Future<String>> futures = executor.invokeAll(tasks);

		for (Future<String> future : futures) {
			System.out.println(future.get());
		}

		executor.shutdown();
	}
}