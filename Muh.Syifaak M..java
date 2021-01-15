import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        System.out.println("PROGRAM BILANGAN FIBONACCI");
        System.out.println("--------------------------");
        //input jumlah bilangan fibonacci
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Jumlah Bilangan Fibonacci : ");
        int value=input.nextInt();
        System.out.println();
        //variabel untuk menghitung bilangan fibonacci
        int fn=1,fn_1=1,fn_2=0,fn_all=0;
        //loop untuk menghitung bilangan fibonacci
        for(int i=1;i<=value;i++){
            if(i<10){
                //format output bilangan fibonacci ke =satuan
                System.out.printf("Bilangan Fibonacci ke %d  adalah %d\n",i,fn);
            }else{
                //format output bilagan fibonacci ke >satuan
                System.out.printf("Bilangan Fibonacci ke %d adalah %d\n",i,fn);
            }
            fn_all=fn_all+fn;
            fn=fn_1+fn_2;
            fn_2=fn_1;
            fn_1=fn;
        }
        //output jumlah keseluruhan bilangan fibonacci
        System.out.println("\nJumlah keseluruhan bilangan Fibonacci adalah "+fn_all);
    }
}