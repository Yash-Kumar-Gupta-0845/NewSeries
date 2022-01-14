class SleepTest extends Thread {
    SleepTest() {
    }

    public void run() {
        for(int i = 0; i <= 5; ++i) {
            try {
                if (i == 3) {
                    System.out.println("After Sleep");
                    sleep(3000L);
                }
            } catch (Exception var3) {
                System.out.println(var3);
            }

            System.out.println(i);
        }

        System.out.println("testing complete");
    }

    public static void main(String[] args) {
        SleepTest a = new SleepTest();
        a.start();
    }
}
