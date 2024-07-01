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
            boolean flag = false;
            int speed = -10;
            while (!flag) {
                System.out.println("Скорость машины №" + i + ": ");
                speed = scanner.nextInt();
                if (speed <= 0 || speed > 250) {
                    System.out.println("Скорость машины должна быть в интервале от 0 до 250.") ;
                    flag = false;
                } else
                    flag = true;
            }

            cars.add(new Car(name, speed));
        }

        scanner.close();

        Race race = new Race();
        for (Car car : cars) {
            race.newLeader(car);
        }
        System.out.println("Самая быстрая машина: " + race.leader);
    }
}
