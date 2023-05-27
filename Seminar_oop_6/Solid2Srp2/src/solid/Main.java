package solid;

import solid.srp.models.Input;
import solid.srp.models.Order;
import solid.srp.models.SaveToJSON;

public class Main{
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Input input = new Input();
        Order order = input.inputFromConsole();
        SaveToJSON saveToJSON = new SaveToJSON("order.json", order);
        saveToJSON.save();
    }
}
