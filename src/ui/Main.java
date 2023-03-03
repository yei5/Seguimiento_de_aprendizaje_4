package ui;

import model.Controller;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    private Controller controller;

    public Main(){
        controller = new Controller();
    }
    public static void main(String[] args) {
        Main m = new Main();
        //m.menu(0);
        m.test();
    }

    public void menu(int option){
        System.out.println("Choose an option: \n1 Add register \n2 Search register \n3 Alphabetical order \n4 top 5\n0 Exit");
        option=sc.nextInt();
        sc.nextLine();
        switch (option){
            case 1:
                addRegister();
                break;
            case 2:
                searchRegister();
                break;
            case 3:
                alphabeticalOrder();
                break;
            case 4:
                break;
            case 0:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        if(option!=0) menu(option);
    }

    public void addRegister(){
        System.out.println("Enter the name of the player:");
        String name = sc.nextLine();
        System.out.println("Enter the score of the player:");
        int score = sc.nextInt();
        sc.nextLine();
        System.out.println(controller.addScoreRegister(score, name));
    }

    public void searchRegister(){
        System.out.println("Enter the value of the score to search:");
        int value=sc.nextInt();
        sc.nextLine();
        System.out.println(controller.searchRegister(value));
    }

    public void alphabeticalOrder(){
        System.out.println(controller.alphabeticalOrder());
    }

    public void test(){
        controller.addScoreRegister(1,"a");
        controller.addScoreRegister(2,"h");
        controller.addScoreRegister(3,"c");
        controller.addScoreRegister(4,"d");
        controller.addScoreRegister(5,"e");
        controller.addScoreRegister(6,"f");
        controller.addScoreRegister(7,"g");
        controller.addScoreRegister(8,"b");
        controller.addScoreRegister(9,"i");
        controller.addScoreRegister(10,"j");
        controller.addScoreRegister(11,"z");
        controller.addScoreRegister(12,"n");
        controller.addScoreRegister(12,"y");
        controller.addScoreRegister(13,"v");
        controller.addScoreRegister(14,"w");
        System.out.println(controller.alphabeticalOrder());
    }
}
