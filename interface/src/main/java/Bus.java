public class Bus implements Transportation {
    @Override
    public int getUnitOfPrice() {
        return 300;
    }

    @Override
    public void select(int fee) {
        if (getUnitOfPrice() <= fee) {
            System.out.println("可以选择大巴车前往北京");

        }
    }
}
