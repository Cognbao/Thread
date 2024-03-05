package Java.thread;

public class main {
    
    public static void main(String[] args) {
		Counter ct = new Counter();
		int numTheach = 6;
		int incrementsperThread = 5;
		
		IncrementThread[] threads = new IncrementThread[numTheach];
		
		for(int i = 0 ; i < numTheach;i++) {
			threads[i] = new IncrementThread(ct, incrementsperThread);
			threads[i].start();
		}
		
		try {
			for (IncrementThread thread : threads) {
				thread.join();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
