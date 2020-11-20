public class Test2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello from main thread");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
//    public void run(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello from MyThread");
    }
}