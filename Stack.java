

//rantang > makanana>nasi>sayur>lauk.//
public class Stack {
    String data[];
    int top;

    public Stack(int jumlah){
        data = new String[jumlah];
        top =-1;
    }
    public void push (String makanan){
        if(top < data.length-1){
            data[++top]= makanan;
        }
    }
    public String pop() {
        if (top >= 0) {
            String temp = data[top--];
            return temp;
        }return pop();
    }
    public  void print(){
        for(int i = top; i>=0 ;i--){
            System.out.println(data[i]); }
    }
    public String cari(String dicari){

        for (int i = data.length-1; i >=0 ; i--) {
            if (data[i]==dicari){
                return data[i]+" Berada Pada Rantang ke "+(i+1);
            }
        }
        return "Makanan Tidak Ada Di Rantang";


    }
}
