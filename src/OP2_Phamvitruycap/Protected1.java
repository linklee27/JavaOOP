package OP2_Phamvitruycap;

import OP2_Phamvitruycap2.Protected2;

public class Protected1 extends Protected2 { //kế thừa class ở packet khác để gọi được hàm protected ở packet khác
    //Có thể gọi biến và hàm protected từ class khác sang (ngoài class, nhưng phải cùng packet, nếu muốn dùng ngoài packet phải có kế thừa)

        public static void main(String[] args) {
            ClassB BT = new ClassB();
            BT.msg();
            System.out.println(BT.data);

            //Ví dụ gọi hàm protected ngoài packet - thông qua kế thừa class Protected2 ở packet khác
            Protected1 BT1 = new Protected1();
            BT1.msg1();
        }
    }
