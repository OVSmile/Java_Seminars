package solid;

import solid.lsp.AbstractOrder;
import solid.lsp.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<AbstractOrder> {
    private List<AbstractOrder> abstractOrders = new ArrayList<>();

    public void add(AbstractOrder abstractOrder) {
        abstractOrders.add(abstractOrder);
    }

    public int calcAmount() {
        int sum = 0;
        for (AbstractOrder abstractOrder : abstractOrders) {
            sum += abstractOrder.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<AbstractOrder> iterator() {
        return abstractOrders.iterator();
    }
}
