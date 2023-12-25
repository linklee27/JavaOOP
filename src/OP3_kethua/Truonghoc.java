package OP3_kethua;

public class Truonghoc extends SinhVien{
    public Truonghoc(int age2, String name2, float height2) {
        super(age2, name2, height2);
    }
//Truonghoc kế thừa từ Sinhvien, SinhVien kế thừa từ NhanVien => Truonghoc kế thừa được NhanVien
    public static void main(String[] args) {
        Truonghoc BT = new Truonghoc(30,"linhlt",30);
        BT.showInfo();  //gọi ham từ class NhanVien

    }
}
