package base;

import java.sql.SQLOutput;

public class BaseUI {

    public static void main(String[] args){

        int num1 = 30;
        int num2 = 60;
        int result = num1 + num2;

        if (result == 90) {
            System.out.println("You have perform addition" + result);
        }else {
            System.out.println("You have added incorrect number");
        }
    }
}
