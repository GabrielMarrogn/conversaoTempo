import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age, anos, meses, dias;
        age = sc.nextInt();
        sc.close();
        anos = age / 365;
        dias = age % 365;
        meses = dias / 30; 
        dias = dias % 30;      

        System.out.println(anos +" ano(s)");
        System.out.println(meses +" mes(es)");
        System.out.println(dias +" dia(s)");


    }
}
