package OP2_Phamvitruycap;

public class Public {
    //PUBLIC: các biến và hàm public dùng được ở tất cả mọi nơi (có thể dùng bên ngoài class, ngoài packet)

    public static void main(String[] args) {
        ClassC BT = new ClassC();
        BT.msg();
        System.out.println(BT.data);
    }
}
