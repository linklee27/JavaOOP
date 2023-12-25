package OP5_tinhdahinh;
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
//Ghi đè: Nếu lớp con có phương thức giống lớp cha, khi sử dụng hàm thì lớp con sẽ ghi đè lớp cha (thực thi hàm class con)
public class GhiDe_01 extends Vehicle {

    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        //Auto-generated method stub
        GhiDe_01 obj = new GhiDe_01();
        obj.run();  //lấy phương thức của thằng con

        //cách lấy phương thức của cha, là khởi tạo đối tượng từ class cha
        Vehicle BT = new Vehicle();
        BT.run();
    }

}
