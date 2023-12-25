package OP2_Phamvitruycap;

public class Private {
//    PRIVATE: các biến và hàm private chỉ dùng trong class, k gọi được sang class khác
//    PROTECTED: Có thể gọi biến và hàm protected từ class khác sang (ngoài class, nhưng phải cùng packet, nếu muốn dùng ngoài packet phải có kế thừa)
//    DEFAULT: không phải là từ khóa, khi k có pvtc thì sẽ áp dung default - chỉ dùng trong cùng packet(ngang với protected)
//    PUBLIC: các biến và hàm public dùng được ở tất cả mọi nơi (có thể dùng bên ngoài class, ngoài packet)

    public static void main(String[] args) {
        ClassA BT = new ClassA();
        //BT. không hiển thị các thành phần trong ClassA có trạng thái private
    }
}
