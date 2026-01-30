public class code5{
         public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        int res=add(10,20);
        int res1=add(10,20,30);
        System.out.println(res);
        System.out.println(res1);
    }
}
    