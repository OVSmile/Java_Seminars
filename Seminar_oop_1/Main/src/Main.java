public class Main {
    public static void main(String[] args) {
        VendingMachine VM = new VendingMachine();
        VM.addProduct(new Product("Cheese", 300))
                .addProduct(new Product("water", 10))
                .addProduct(new Product("wine", 330))
                .addProduct(new Yigurt("Danon", 50, "sweet"))
                .addProduct(new meat("Fillet", 500, "chicken"))
                .addProduct(new Bread("long loaf", 100, "wheat"));

        for (int i = 0; i < VM.getList().size(); i++) {
            System.out.println(VM.getList().get(i));
        }
        Product found = VM.findProduct("wine");
        System.out.println(found);

        Product sellProd = VM.sell(found);
        System.out.println("amount = " + VM.getAmount());

        for (int i = 0; i < VM.getList().size(); i++) {
            System.out.println(VM.getList().get(i));
        }

        System.out.println("Покупка");
        Product buy = VM.sell(VM.findProduct("water"));
        System.out.println(buy);
        System.out.println("Список товаров");
        for (int i = 0; i < VM.getList().size(); i++) {
            System.out.println(VM.getList().get(i));
        }
        System.out.println("Заработано");
        System.out.println("Сумма = " + VM.getAmount());
        try {
            Product buy_2 = VM.sell(VM.findProduct("long loaf"));
            System.out.println(buy_2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}