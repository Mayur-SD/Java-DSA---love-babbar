public class methods {

    public static void printWelMsg(){
        System.out.println("Welcome Our DSA series by Love Babber");
    }

    public static int add(int x, int y){
        int add = x + y;
        System.out.println(add);
        return add;
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isEven(4));
    }
}
