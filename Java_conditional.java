// import java.util.Scanner;

public class Java_conditional {
    public static void main(String[] args) {
        /*
         * conditional statement
         * ->ifs
         * ->if else
         * ->
         */
        // int age = 22;
        // // if else
        // if (age >= 18) {
        // System.out.println("you can drive");
        // } else {
        // System.out.println("you can't drive");
        // }

        // else if statement(ladder)
        // if (age>=18) {
        // System.out.println("you can drive");
        // } else if (age>15 && age<18) {
        // System.out.println("you can't drive");
        // } else if (age<=15) {
        // System.out.println("Go and drink bournvita");
        // } else {
        // System.out.println("Go and drink Milk");
        // }

        // print a largest of 2
        // int A = 1;
        // int B = 3;
        // if (A > B) {
        // System.out.println("A Greater than B");
        // } else {
        // System.out.println("B is Greater than A");
        // }

        // print the nuber is even or odd
        // int v = 5;
        // if (v % 2 == 0) {
        // System.out.println("The v 5 number is odd");
        // } else {
        // System.out.println("The v 5 number is odd");
        // }

        // income tax calculator
        /*
         * income < 5lac -> 0%
         * income between 5-10lac ->20%
         * income > 10lac ->30%
         */
        // Scanner sc = new Scanner(System.in); //**
        // int income = sc.nextInt();
        // int tax;

        // if (income < 500000) {
        // tax = 0;
        // System.out.println("you have to paid " + tax);
        // } else if (income >= 500000 && income < 1000000) {
        // tax = (int) (income * 0.2);
        // System.out.println("you have to paid tax " + tax);
        // } else {
        // tax = (int) (income * 0.3);
        // System.out.println("you have to paid tax " + tax);
        // }
        // sc.close();

        // print of largest of three
        // a=1,b=3,c=6
        // int a = 1, b = 3, c = 6;
        // if ((a > b) && (a > c)) {
        // System.out.println("A is greater of all.");
        // } else if (b > c) {
        // System.out.println("B is greater of all.");
        // } else {
        // System.out.println("C is greater of all.");
        // }

        // ternary operator
        // variable=condition?statement1:statement 2;
        // int larger = (5 > 3) ? 5 : 3;
        // System.out.println(larger);// int cannot be converted to boolean

        // int number = 4;
        // String type = ((number % 2) == 0 ? "even" : "odd");
        // System.out.println(type);

        // check std=udent is pass or fail
        // mark>=33->pass
        // mark<=33->fail
        // int marks = 90;
        // String report = (marks < 33) ? "fail" : "pass";
        // System.out.println(report);

        // switch statement
        // options--->
        // 1->sasmosa
        // 2->burger
        // 3->mango shake

        // Scanner sc = new Scanner(System.in); //**
        // System.out.println("enter the option:");
        // int option = sc.nextInt();
        // switch (option) {
        // case 1:
        // System.out.println("samosa is ordered");
        // break;
        // case 2:
        // System.out.println("burger is odered");
        // break;
        // case 3:
        // System.out.println("mango shake is odered");
        // default:
        // System.out.println("get from dream");
        // }sc.close();

        // calculator is using switch---->user driven program
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the variables:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Enter the operation:");
        // char s = sc.next().charAt(0);
        // switch (s) {
        // case '+':
        // System.out.println(a + b);
        // break;
        // case '-':
        // System.out.println(a - b);
        // break;
        // case '*':
        // System.out.println(a * b);
        // break;
        // case '/':
        // System.out.println(a / b);
        // break;
        // default:
        // System.out.println("bas kaar bahi or kya command dega...?");
        // }
    }

}
