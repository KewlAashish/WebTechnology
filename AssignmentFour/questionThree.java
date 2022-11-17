import java.util.*;

class Number{
    private double num;

    Number(double num){
        this.num=num;
    }

    boolean isZero(){
        return (num==0);
    }

    boolean isPositive(){
        return (num>0);
    }

    boolean isNegative(){
        return (num<0);
    }

    boolean isOdd(){
        return ((num%2)!=0);
    }

    boolean isEven(){
        return ((num%2)==0);
    }

    boolean isPrime(){
        for (int i=2; i<num; i++){
            if ((num%i)==0){
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong(){
        int number = (int)num;
        int sum=0, temp;
        int noOfDigits=0;
        temp=number;
        while (temp>0){
            temp/=10;
            noOfDigits++;
        }

        temp=number;

        while (temp>0){
            sum+=Math.pow(temp%10, noOfDigits);
            temp/=10;
        }

        if (number==sum){
            return true;
        }
        else{
            return false;
        }
    }

    double getFactorial(){
        int number = (int)num;
        double fact=1;
        for (int i=2; i<=number; i++){
            fact*=i;
        }
        return fact;
    }

    double getSqrt(){
        return Math.sqrt(num);
    }

    double getSqr(){
        return Math.pow(num, 2);

    }

    double sumDigits(){
        int number = (int)num;
        double sum=0;
        while (number>0){
            sum+=(number%10);
            number=number/10;
        }
        return sum;

    }

    double getReverse(){
        int number = (int)num;
        double reverse = 0;
        while (number>0){
            reverse = (reverse*10)+(number%10);
            number/=10;
        }
        return reverse;        
    }

    void listFactor(){
        for (int i = 0; i < num; i++) {
            if ((num%i)==0){
                System.out.print(i+" ");
            }
            
        }
        System.out.println();

    }

    void listBinary(){
        int number = (int)num;
        if (num==0){
            System.out.println("0");
            return;
        }
        StringBuilder binary = new StringBuilder();
        while (number>0){
            binary.insert(0, (number&1));
            number>>=1;
        }
        System.out.println(binary);
    }
}



class questionThree{
    public static void main(String[] args) {
        Number n = new Number(152);
        System.out.println(n.isZero());
        System.out.println(n.isPrime());
        System.out.println(n.isArmstrong());
        System.out.println(n.getFactorial());
        System.out.println(n.getSqrt());
        System.out.println(n.getSqr());
        System.out.println(n.sumDigits());
        System.out.println(n.getReverse());
        n.listFactor();   
        n.listBinary();
    }
}