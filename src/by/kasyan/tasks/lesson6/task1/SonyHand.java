package by.kasyan.tasks.lesson6.task1;

public class SonyHand implements IHand {

    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
