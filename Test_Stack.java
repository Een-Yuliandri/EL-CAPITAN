public class Test_Stack {
    public static void main(String[] args) {
        Stack n = new Stack(4);
        n.push("nasi");
        n.push("sayur");
        n.push("ayam goreng");
        n.push("lauk kuah");
        n.print();
        System.out.println("==================================");
        System.out.println(" Kita Akan Ambil Sayur");
        // maka kita akan keluarkan Lauk kuah dan kemudian Ayam Goreng dan kemudian Sayur
        n.pop();
        n.print();
        System.out.println("==================================");
        n.pop();
        n.print();
        System.out.println("==================================");
        System.out.println(n.pop());
        System.out.println("==================================");
        System.out.println(n.cari("nasi"));
    }
}
