package march.day25;

public class ClassTest extends ClassB{
    public void print(ClassTest b){

        System.out.println(b.name);
        System.out.println(b.flag); //패키지가달라도 상속관계에 있으므로 사용가능.
//        System.out.println(b.address);
//        System.out.println(b.age);
    }

    public static int sum(int x, int y){
        return x+y;
    }
//    public void sum(int x, int y){
//
//    }
//


    public static void main(String[] args) {
        ClassTest test = new ClassTest();
        test.print(test);

        int sum = sum(2,4);
        sum(4,5);
        System.out.println(10);
        System.out.println("abc");
        System.out.println(10.9);
        System.out.println(false);
        System.out.println('a');

        march.day25.ClassTest test22 = new march.day25.ClassTest();
    }
}
