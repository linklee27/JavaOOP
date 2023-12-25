package OP5_tinhdahinh;

public class NapChong_02 {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        NapChong_02 BT = new NapChong_02();

        System.out.println(BT.add(1,2)); //thay đổi kiểu dữ liệu của tham số
    }
}
