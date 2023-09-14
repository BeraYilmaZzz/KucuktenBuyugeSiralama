import java.util.Scanner ;
public class MAİN {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in) ;
        int a, b, c;
        System.out.print("İlk sayıyı giriniz : ");
        a = inp.nextInt() ;
        System.out.print("İkinci sayıyı giriniz :");
        b=inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz :");
        c=inp.nextInt();
        if( ( a < b ) && ( a < c ) ) {
            if (b < c){
                System.out.println("a <  b <  c");
            }else {
                System.out.println("a <  c <  b");
            }
        }else if ( ( b < c ) && ( b < a ) ) {
            if (a < c) {
                System.out.println("b <  a <  c");
            }else {
                System.out.println("b <  c <  a");
            }
        }else{
            if (a < b) {
                System.out.println("c <  a <  b");
            }else {
                System.out.println("c <  b <  a");
            }
        }
    }
}
