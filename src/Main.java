
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static class Foo {
        public static void first() {
            System.out.print("first");
        }

        public static void second() {
            System.out.print("second");
        }

        public static void third() {
            System.out.println("third");
        }

        public static void main(String[] args) {


            Runnable taskA = () -> {
                first();

            };

            Runnable taskB = () -> {
                second();
            };

            Runnable taskC = () -> {
                third();
            };
    taskA.run();
    taskB.run();
    taskC.run();
    NewThread nt1 = new NewThread("A");
    NewThread nt2 = new NewThread("B");
    NewThread nt3 = new NewThread("C");
    nt1.run();
    nt2.run();
    nt3.run();
        }
    }

    static class NewThread implements Runnable {
        String name;

        NewThread(String threadName) {
            name = threadName;
        }

        public void run() {
            System.out.println("Thread " + name + " is running");
        }
    }
}