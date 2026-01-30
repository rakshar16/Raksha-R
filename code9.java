class Student{
    int id;
    String name;
    int age;

     Student(int a,String b,int c){
     id=a;
     name=b;
     age=c;
}
    void display(){
    System.out.println(id + " " + name + " " + age);
    }
}
class code9{
    public static void main(String[] args) {
        Student s1 = new Student(1,"prathi",20);
        Student s2 = new Student(2,"raksh",30);

            s1.display();
            s2.display();
        
    }
}