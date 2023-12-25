package OP3_kethua;

public class NhanVien {

    int age = 30;
    String name = "LinhLT";
    float height = 40;

    //Hàm xây dựng, nhận từ khóa SUPER từ lớp con
    public  NhanVien (int age, String name, float height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public void showInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.height);
    }

    public static void main(String[] args) {

    }

}

