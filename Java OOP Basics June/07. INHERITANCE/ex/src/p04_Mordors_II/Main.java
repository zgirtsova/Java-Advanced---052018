package p04_Mordors_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] foods = reader.readLine().split(" ");

        Gandalf gandalf = new Gandalf();

        for (String food : foods) {
            gandalf.calculateHappiness(food);
        }

        System.out.println(gandalf.getHappiness());

        if(gandalf.getHappiness() < -5){
            System.out.println("Angry");
        }else if(gandalf.getHappiness() < 0){
            System.out.println("Sad");
        }else if(gandalf.getHappiness() < 15){
            System.out.println("Happy");
        }else{
            System.out.println("JavaScript");
        }
    }
}
