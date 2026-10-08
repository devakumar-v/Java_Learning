class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (i == 1)
                Thread.yield();
            System.out.println("\tForm Thread A:i" + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tForm Thread B:j" + j);
            if (j == 3)
                interrupt();
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\tForm Thread A:k" + k);
            if (k == 1)
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
        System.out.println("Exit form C");
    }
}

class thread1 {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        System.out.println("Start thread A");
        threadA.start();
        System.out.println("Start thread A");
        threadB.start();
        System.out.println("Start thread A");
        threadC.start();
    }
}
