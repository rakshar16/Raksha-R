class Person{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void SetAge(int age){
        this.age=age;
    }
    }
    class code10{
        public static void main(String[] args) {
            Person P1 = new Person();
            P1.SetName("raksh");
            P1.SetAge(20);
            System.out.println(P1.getName());
            System.out.println(P1.getAge());

        }
    }
