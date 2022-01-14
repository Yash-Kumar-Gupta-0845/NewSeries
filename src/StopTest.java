class StopTest extends Thread {
    StopTest() {
    }

    public void run() {
        for(int i = 0; i <= 5; ++i) {
            if (i == 2) {
                this.stop();
            }

            System.out.println("a : " + i);
        }

    }

    public static void main(String[] args) {
        StopTest a = new StopTest();
        a.start();
    }
}
