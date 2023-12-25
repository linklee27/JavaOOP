package OP6_tinhtruutuong;
//abstract class: trong abstract class có các hàm abstract
//- Không thể khởi tạo đối tượng của abstract class (chỉ kế thừa được)
//- class kế thừa lại abstract class phải định nghĩa lại hàm đó.
//- không hỗ trợ đa kế thừa, chỉ kế thừa 1 class thôi
//- Mục đích là xây dựng ra để cho thằng khác dùng, nên mức độ truy cập k được dùng private -> phải public hoặc protected
//abstract class:
//     hàm 1
//     hàm 2
public abstract class Shape_abstractClass {
    String color;
    String getColor() {
        return this.color;
    }

    abstract double area();   //khai báo hàm abstract - chỉ khai báo, Không thể khởi tạo đối tượng
}

