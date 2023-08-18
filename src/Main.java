
public class Main {
    public static class Foo {
        public static void first(Runnable r) {
            System.out.print("first"); }
        public static void second(Runnable r) {
            System.out.print("second"); }
        public static void third(Runnable r) {
            System.out.print("third");
        }
        public static void main(String[] args) {
            NewThread nt1 = new NewThread("A");
            NewThread nt2 = new NewThread("B");
            NewThread nt3 = new NewThread("C");
            first(nt1);
            second(nt2);
            third(nt3);

        }
    }
static class NewThread implements Runnable{
            String name;
            Thread t;
            NewThread(String threadName){
                name = threadName;
                t = new Thread(this, name);
            }
            public void run(){

            }
    }

}