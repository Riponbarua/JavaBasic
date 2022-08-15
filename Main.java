import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //if,else
        // else
        //switch
        //break
        // if( condition){
        // }
        //else{

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Adilt");
    }else{
        System.out.println("not Adult");
        }
        System.out.println("*************************************");

       int x = sc.nextInt();

        if(x % 2 ==0){
            System.out.println("Even");

        } else {
            System.out.println("odd");
        }

        System.out.println("*************************************");

        int a = sc.nextInt();
        int b= sc.nextInt();

        if(a == b){
            System.out.println("Equal");

            } else {
                if(a > b){
                    System.out.println("a is greater");
                }else {
                    System.out.println("a is lesser");
                }
            }


        System.out.println("*************************************");

        int e = sc.nextInt();
        int f= sc.nextInt();

        if(e == f){

            System.out.println("Equal");

        } else if(e > f){

                System.out.println("a is greater");
        }else {

                System.out.println("a is lesser");

        }

        System.out.println("*************************************");

        int button = sc.nextInt();
        if(button == 1){
            System.out.println("hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if ( button==3){
            System.out.println("Ni hao");
        }
        else {
            System.out.println("Invalid Button");
        }
        System.out.println("*************************************");

        //switch
        //break
        //case

        switch (button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            case 4 : System.out.println("Invalid Button");
        }






    }


    }