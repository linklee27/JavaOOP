package OP1_class_object;

public class Nhanvien {
    public int age;
    public String name;
    public String address;
    public String jobname;
    //tạo hàm xây dựng click chuột phải -> gennerate -> contrucstor
    public Nhanvien(int age) {
        this.age = age;
    }

    //tạo hàm get, click chuột phải -> gennerate -> getter
    public void setName(String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien(30);
        System.out.println(nv.age);

        nv.setName("LinhLT");
        nv.getName();


    }
}
