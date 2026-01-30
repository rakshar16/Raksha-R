class Student{
    int id;
    String name;
        Student(int i,String name){
            id=i;
            this.name=name;
        }
   void display() {
         System.out.println(id+" "+name);
       }
    }
    class code8{
        public static void main(String[] args) {
            Student s1=new Student(1,"prathibha");
            Student s2=new Student(2,"raksha");
            s1.display();
            s2.display();
        }
    }
