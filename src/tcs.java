import java.sql.SQLOutput;
import java.util.*;
public class tcs {
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int getprime(int n){
        int count=0;
        int num=1;
        while(count<n){
            num++;
            if(isprime(num)){
                count++;
            }
        }
        return num;
    }

    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c = getprime(a);
        int d=getprime(b);
        int res= (c*d)-1;
        System.out.println(res);
    }
}
