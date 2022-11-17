import java.util.*;

class questionOne{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Vector v = new Vector(size);

        for (int i=0; i<size; i++){
            v.addElement(sc.next());
        }

        System.out.println("Vector values are ");
        for (int i = 0; i < size; i++) {
            System.out.println(v.elementAt(i));            
        }

        sc.close();
    }
}