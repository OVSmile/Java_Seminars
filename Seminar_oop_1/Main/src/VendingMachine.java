import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> list = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;

    public VendingMachine addProduct(Product product){
        list.add(product);
        return this;
    }

    public List<Product> getList() {
        return list;
    }

    public Product findProduct(String string){
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)){
                return getList().get(i);
            }
        }
        return null;
    }
     public Product sell(Product product){
        try {
            Product prodFount = findProduct(product.getName());
            getList().remove(prodFount);
            amount += prodFount.getCost();
            return prodFount;
        }
        catch (Exception ex){
            throw new RuntimeException("Товар не найден");
        }

     }
}

