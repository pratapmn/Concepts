package mine.threads;

/**
 * Created by pratapn on 4/4/16.
 */
public class SimpleThread {

    static final int loop = 100;

    static abstract class looper implements Runnable {

        public void run() {
            int i = 0;
            try {
                while (i < loop) {
                    Thread.sleep(Math.round(Math.random() * 1000));
                    System.out.println(getMessage());
                    i++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        abstract String getMessage();
    }

    public static void main(String[] args) throws InterruptedException {

        Thread shouldwait = new Thread(new looper() {
            String getMessage() {
                return "Waiting ..... !!!!";
            }
        });

        Thread shouldgo = new Thread(new looper() {
            String getMessage() {
                return "Should I go ..... !!!!";
            }
        });
        shouldwait.start();
        shouldgo.start();
    }
}
