import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        System.out.println("Введите 3 машины:");
        for (int i = 1; i < 4; i++) {
            System.out.println("Имя машины №" + i + ": ");
            String name = scanner.next();
            System.out.println("Скорость машины №" + i + ": ");
            int speed = scanner.nextInt();
            cars.add(new Car(name, speed));
        }

        scanner.close();

        Race race = new Race();
        for (int i = 1; i < 3; i++) {
            race.newLeader(cars.get(i));
        }
        System.out.println("Самая быстрая машина: " + race.leader);
    }
}
