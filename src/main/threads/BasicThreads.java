package threads;

public class BasicThreads {
	public static void main(String[] args) {
        new Thread(() -> {
            while(true) {
                System.out.println("TIC");
                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        }).start();

        new Thread(() -> {
            while(true) {
                System.out.println("TAC");
                try { Thread.sleep(1100); } catch (Exception e) {}
            }
        }).start();
    }

}
