package parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String address;
    private  int numberOfSeats;

    public Parking(String address, int numberOfSeats) {
        this.address = address;
        this.numberOfSeats = numberOfSeats;
    }

    List<Car> carList = new ArrayList<>();

    void park() throws IOException {
        boolean chek = false;
        while (!chek) {


            System.out.println("Для парковки введи название машины и её номер через  -. Для отображения машин введите LIST, для выхода STOP");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String tachilo = reader.readLine();

            switch (tachilo) {
                case "LIST":
                    for (Car car : carList) {
                        System.out.println("Машина " + car.getName() + " c номерамми " + car.getNumber() + " стоит на стонке.ID: "  + car.getId());


                    }
                    break;
                case "STOP":
                    chek = true;
                    break;
                default:

                    if(carList.size() == numberOfSeats) {
                        System.out.println("Праковочный мест нет");
                        continue;
                    }
                    else {
                        String[] infoCar = tachilo.split(",");
                        carList.add(new Car(infoCar[0], infoCar[1]));
                    }
                    break;

            }






        }

    }


}
