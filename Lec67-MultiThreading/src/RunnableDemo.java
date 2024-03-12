public class RunnableDemo implements Runnable {

    private String threadName;
    private Thread t;
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public RunnableDemo(String name) {
        // ถ้าคนละชื่อ ไม่ต้องใส่ this ก็ได้
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) { // Thread ยังไม่เคยทำงานเลย
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
