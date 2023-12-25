package OP6_tinhtruutuong;
//Interface: là 1 khuôn mẫu, bản vẽ khung sườn, không phải lớp đối tượng
//- Hàm trong interface chỉ được khai báo, mà k được định nghĩa.
//- 1 class có thể implements nhiều interface, khi implements thì phải định nghĩa lại hàm đó.
//        Interface:  bản vẽ khung sườn
//          bản vẽ 1: nhà vệ sinh, nhà tắm
//          bản vẽ 2: sân vườn, nhà đậu xe
public interface Persion_interface {
    String getName();          //Phương thức interface - chỉ khai báo, Không thể khởi tạo đối tượng
    String getAddress();
}
