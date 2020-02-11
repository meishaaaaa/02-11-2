public class Train implements Transportation {

    @Override
    public int getUnitOfPrice() {
        return 400;
    }


    @Override
    public void select(int fee) {
        if (getUnitOfPrice() <= fee) {
            System.out.println("可以选择火车前往北京");

        }
    }
}
