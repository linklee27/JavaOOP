package OP4_tinhdonggoi;

public class LearTinhDongGoi {
    public static void main(String[] args) {
        Student BT = new Student();
        //set thong tin Student
        BT.setMssv("12345");
        BT.setName("LinhLT");
        BT.setAge(101);
        //lấy ra thông tin Student
        System.out.println("Ma so sinh vien la:" + " " + BT.getMssv());
        System.out.println("Ten la:" + " " + BT.getName());
        System.out.println("tuoi la:" + " " + BT.getAge());

    }
}
