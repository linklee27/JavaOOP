package OP6_tinhtruutuong;

public class Rectangle extends Shape_abstractClass implements Persion_interface {  //vừa kế thừa class(extends), vừa kế thừa được interface(dùng implement)

    public double area(){            //định nghĩa lại hàm abstract ở class Shape
        return 10;
    }

    public String getName(){        //định nghĩa lại hàm interface ở implement persion
        return null;
    }

    public String getAddress(){     //định nghĩa lại hàm interface ở implement persion
        return null;
    }
}
