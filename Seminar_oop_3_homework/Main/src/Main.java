
public class Main {
    public static void main(String[] args) {
        ListNodes<Integer> listNodes = new ListNodes<>();
        listNodes.addLast(5);
        listNodes.addLast(6);
        listNodes.addLast(7);
        listNodes.addFront(4);

        for(Integer data: listNodes) {
            System.out.println(data);
        }

        ListNodes<String> listStrings = new ListNodes<>();

        listStrings.addLast("Aaa");
        listStrings.addFront("Sss");
        for(String data: listStrings) {
            System.out.println(data);
        }

     }
}