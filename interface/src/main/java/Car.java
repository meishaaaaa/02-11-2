public class Car implements Transportation {

    @Override
    public int getUnitOfPrice() {
        return 500;
    }

    @Override
    public void select(int fee) {
        if (getUnitOfPrice() <= fee) {
            System.out.println("可以选择自驾前往北京");
        }

    }

}
