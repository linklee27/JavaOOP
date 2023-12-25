package OP3_kethua;

public class SinhVien extends NhanVien {

//Nếu class cha có hàm xây dựng, thì khi con kế thừa hàm xây dựng đó phải dùng SUPER để truyền vào đủ tham số maping với kiểu dữ liệu của hàm xây dụng lớp cha(giá trị k cần giống cha)
//Nếu class cha không có hàm xây dựng thì khi con kế thừa không cần dùng SUPER, hoặc có dùng thì không cần truyền tham số.

    public SinhVien (int age2, String name2, float height2){ //kế thừa hàm xây dựng phải dùng SUPER
        super(age2, name2, height2);     //3 tham số này sẽ truyền ngược về lớp cha
    }

    public static void main(String[] args) {
        SinhVien BT = new SinhVien(20, "LinhLT", 30);
        BT.showInfo();//class con gọi hàm showInfor từ class cha

    }
}
