package by.kasyan.tasks.lesson6.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Spaceport spaceport = new Spaceport();
        Shuttle shuttle = new Shuttle();
        spaceport.launch(shuttle);

    }
}
