package net.hypixel.example;

public class CountsExample {
    public static void main(String[] args) {
        ExampleUtil.API.getCounts().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}
