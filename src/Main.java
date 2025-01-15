public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread 실행");
        }
    }
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // 실행할 코드
            System.out.println("Runnable 스레드 실행 중...");
        }
    }
}
