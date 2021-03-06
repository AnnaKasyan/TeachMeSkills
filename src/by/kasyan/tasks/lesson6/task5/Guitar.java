package by.kasyan.tasks.lesson6.task5;

public class Guitar implements Instrument {

    private final int numOfStrings;

    public Guitar(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + numOfStrings + " струнами.");
    }
}
