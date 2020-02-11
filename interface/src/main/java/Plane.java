public class Plane implements Transportation {
    @Override
    public int getUnitOfPrice() {
        return 1000;
    }


    @Override
    public void select(int fee) {
        if (getUnitOfPrice() <= fee) {
            System.out.println("可以选择飞机前往北京");

        }

    }

}
