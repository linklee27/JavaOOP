package OP2_Phamvitruycap;

public class ClassA {
    //các biến và hàm private chỉ dùng trong class, k gọi được sang class khác
    private int data = 40;
    private void msg(){
        System.out.println("aaaaa");
    }

    public static void main(String[] args) {
        ClassA BT = new ClassA();
        BT.msg();

    }
}

