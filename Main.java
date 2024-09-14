package parking;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parking p = new Parking("Ленина 10",5);
        p.park();
    }
}
