public class Test_NEW_QUE {
    public static void main(String[] args) {
        NEW_QUE a = new NEW_QUE(3);
        a.enqueue("Torpedo");
        a.enqueue("pepsi");
        a.enqueue("mesiu");

        String b = a.craft(a.dequeue(),a.dequeue());
        System.out.println(b);
        System.out.println(a.craft(b,a.dequeue()));
    }
}
