package Introduction;

class student{
    int rollno;
    String name;
    float marks;

    public student(int roll, String name, float marks) {
        this.name = name;
        this.rollno = roll;
        this.marks = marks;
    }

    public student(){
        // constructor calling constructor
        this(12,"xcdfv",33.0f);
    }

    //    void getData(int rollno,String name,float marks){
//        this.rollno = rollno;
//        this.name = name;
//        this.marks = marks;
//    }
    void display(){
        System.out.println(rollno+" "+name+" "+marks);
    }
}
public class demo1 {
    public static void main(String[] args) {
//        student ajay = new student();
//        ajay.rollno = 1;
//        ajay.name = "aman";
//        ajay.marks = 99.0f;
//        ajay.display();

//        ajay.getData(1,"ajay patel", 93.50F);
        student aman = new student(2,"aman patel", 93.50F);
        aman.display();
    }
}



