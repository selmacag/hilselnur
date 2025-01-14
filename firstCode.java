public class firstCode {

    public static void main(String[] args) {


        oddEven(7);


        for (int i=0; i<= 10 ; i++) {
            System.out.print(i);
        }



    }

    public static void oddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
    }


}
