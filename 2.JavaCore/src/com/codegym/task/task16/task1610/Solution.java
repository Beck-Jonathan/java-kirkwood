package com.codegym.task.task16.task1610;

/* 
Arranging calls to join()

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Missy");
        cat1.join();
        Cat cat2 = new Cat("Coco");
        cat2.join();
    }

    private static void investigateWorld() throws InterruptedException {
        Thread.sleep(200);

    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Kitten 1 (mother - " + getName() + ")");
            kitten2 = new Kitten("Kitten 2 (mother - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " gave birth to 2 kittens");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": All the kittens are in the basket. " + getName() + " brought them back");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " got out of the basket");
            try {
                investigateWorld();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
