public class Lion extends CatFamily {
    public Lion() {
        super(2, 2, true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" антилопу");
    }
}
