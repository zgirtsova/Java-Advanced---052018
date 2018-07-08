import java.util.*;

public class P01_ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashSet<String> parkingLot = new HashSet<>();

        while (!"END".equals(input)){

            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String carNumber = tokens[1];

            if(direction.equals("IN")){
                parkingLot.add(carNumber);
            }else {
                parkingLot.remove(carNumber);
            }

            input = scanner.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car : parkingLot) {
                System.out.println(car);
            }
        }
    }
}