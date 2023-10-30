package threadAssignment;

public class ThreadExample1 {
    private static int[] arr = {1, 20, 50, 15, 30};
    private static double average;
    private static boolean isAverageCalculated = false;

    public static void main(String[] args) {
        Thread averageThread = new Thread(() -> {
            synchronized (arr) {
                try {
                    for (int i = 0; i < 10 && i < arr.length; i++) {
                        average += arr[i];
                        Thread.sleep(100);  // Simulate some work
                    }
                    average = average / Math.min(10, arr.length);
                    isAverageCalculated = true;
                    arr.notify(); // Notify the other thread
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread squareThread = new Thread(() -> {
            synchronized (arr) {
                while (!isAverageCalculated) {
                    try {
                        arr.wait(); // Wait for the average to be calculated
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int num : arr) {
                    System.out.println("Square of " + num + ": " + num * num);
                }
            }
        });

        averageThread.start();
        squareThread.start();
    }
}

