package OP4_tinhdonggoi;

public class Student {
    private String mssv;
    private String name;
    private int age;
    private final String schoolName = "đại học thủy lợi"; // biến đề final chỉ tạo được hàm get, k tạo được hàm set
//get value
    public String getMssv() {
        return mssv;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//set value
    public void setMssv(String mssv) {
        if (mssv.length() <6){
            System.out.println("mat khau phai > 6 ký tu");
        } else if (mssv.length() > 12) {
            System.out.println("mat khau phai < 12 ky tu");
        }
        else this.mssv = mssv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >100){
            System.out.println("tuoi khong hop le");
        }
        else this.age = age;

    }
}
