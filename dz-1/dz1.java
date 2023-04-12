import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {
        Task4();
        }
    
        static void Task1() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number n: ");
            int n = in.nextInt();
            in.close();
            int sum = 0;
            if (n<0) {  System.out.println("Wrong number");}
            else if (n == 0 || n == 1) {  System.out.printf("Summ: %d", n);}
            else {
            for (int i = 1; i <= n; i++)
            {
                sum+=i;
            }
            System.out.printf("Summ is: %d", sum);
            }
        }
    
        static void Task2() {
    
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number n: ");
            int n = in.nextInt();
            in.close();
            int factorial = 1;
            if (n<0) {  System.out.println("Wrong nubmer");}
            else if (n == 0 || n == 1) {  System.out.printf("%d! equal 1", n);}
            else
            {
            for (int i = 2; i <= n; i++)
            {
                factorial*=i;
            }
            System.out.printf("%d! equal %d", n, factorial);
            }
        }
    
        static void Task3() {

            int n = 1000;
            int[] arr = IntStream.rangeClosed(0, n).toArray();
            arr[1] = 0; 
            double sqrt = Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                for (int j = i * i; j < arr.length; j = j + i) 
                {
                    arr[j] = 0;
                }
            }
            int count = 0; 
            for (int i = 0; i <= n; i++) {
                if (arr[i] != 0) {
                    count++;
                }
            }
            int[] newArr = new int[count];
            int j = 0;
            for (int i = 0; i <= n; i++) {
                if (arr[i] != 0) {
                    newArr[j] = arr[i];
                    j++;
                }
            }

            String res = Arrays.toString(newArr);
            System.out.printf(res);
        }
        
        static void Task4() {
    
            Scanner in = new Scanner(System.in);
            
            System.out.println("a =  ");
            double a = in.nextDouble();

            System.out.println("Operation: + / - / * / : ");
            String value = in.next();

            System.out.println("b =  ");
            double b = in.nextDouble();
            in.close();

            double res=0;
            switch (value) {
            case "+":
            res = a + b;
            break;
            case "-":
            res = a - b;
            break;
            case "*":
            res = a * b;
            break;
            case ":":
            res = a / b;
            break;

            default:
            res = 0;
            break;
            }

            System.out.printf("Answer: %s", res);  
        }
    
    
}
