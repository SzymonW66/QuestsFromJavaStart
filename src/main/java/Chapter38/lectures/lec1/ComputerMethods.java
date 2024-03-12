package Chapter38.lectures.lec1;

import java.util.List;
import java.util.function.Consumer;

public class ComputerMethods {


    public static void main(String[] args) {
        Computer lenovo = new Computer("Lenovo", 3000, 45);
        System.out.println(lenovo);
        List<Computer> computerList = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("MSI", 4000, 66),
                new Computer("HP", 2000, 80),
                new Computer("Asus", 2800, 42)
        );
        lenovo.overtclock();
        System.out.println(lenovo.getCpu() + " " + lenovo.getTemperature());

        consume(computerList, Computer::overtclock);
        System.out.println(computerList);


//        Consumer<Computer> computerPrinterWithTemperature = c -> {
//            String text = c.getName() + " " + c.getCpu();
//            if (c.getTemperature() < 50) {
//                text += "/ cold";
//            } else
//                text += "/ hot";
//            System.out.println(text);
//        };
//
//        consume(computerList, computerPrinterWithTemperature);

        consume(computerList, ComputerMethods::printComputerWithTemperature);

    }

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer : computers) {
            consumer.accept(computer);
        }

    }

    private static void printComputerWithTemperature(Computer computer) {
        String text = computer.getName() + " " + computer.getCpu();
        if (computer.getTemperature() < 50) {
            text += "/ cold";
        } else
            text += "/ hot";
        System.out.println(text);
    }
}
