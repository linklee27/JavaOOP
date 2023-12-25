package OP1_class_object;

public class ClassAndObject {
    static String name = "Full house";
    static int age = 29;

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public void conghaiso(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        //có 3 cách để gọi thành phần trong class.
        //1. gọi thanh phần của lớp thông qua đối tượng
        ClassAndObject BT = new ClassAndObject();  //khai báo 1 đối tượng để thông qua class gọi các hàm trong class
        ClassAndObject BT1 = new ClassAndObject();
        BT.getName();             //đối tượng gọi hàm thông qua class
        BT1.getAge();
        BT.conghaiso(2, 4);

        //2. Gọi thanh phan cua lơp thông qua tên lớp (phải có status static)
        System.out.println(ClassAndObject.name);
        System.out.println(ClassAndObject.age);

        //3. gọi thanh phần của lớp theo kiểu Annonymous (vô danh, k có đối tượng)
        new ClassAndObject().getName();
        new ClassAndObject().conghaiso(2, 5);

    }
}
//OBJECT:
//- Đối tượng/Object Là một cái tên, là sự thể hiện của claas, thay mặt cho class để có thể chấm gọi những thành phần thuộc class đó.
//- Từ 1 class có thể tạo nhiều đối tượng, khác tên.
//
// CLASS
//- Class là 1 cấu trúc gồm nhiều thành phần: biến, hàm xây dựng, hàm đối tượng...
//- Có thể tạo nhiều đối tượng cho 1 class.
//- Có 3 cách để khởi tạo đối tượng cho class.
