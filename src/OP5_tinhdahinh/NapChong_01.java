package OP5_tinhdahinh;

public class NapChong_01 {
    //TÍNH ĐA HÌNH: thể hiện qua nạp chồng và ghi đè
    //1 class có thể có nhiều hàm giống nhau, chỉ cần khác tham số truyền vào, Khi được gọi dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện.

    public void tinhtong(int a, int b){

    }

    public void tinhtong(int a, int b, int c){

    }

    public static void main(String[] args) {
        NapChong_01 BT = new NapChong_01();
        BT.tinhtong(1,2, 3);  //điền 2 tham số thì tự động gọi hàm 1, điền 3 tham số thì tự động gọi hàm 2
    }
}
