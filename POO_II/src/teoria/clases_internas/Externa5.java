package teoria.clases_internas;

import java.util.Random;

public class Externa5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Hilos()).start();
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(new Random().nextInt(100));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        System.out.println("Fin de programa");

    }
}
class Hilos implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(new Random().nextInt(1_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
