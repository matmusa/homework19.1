import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("ПЛАНЕТАНЫН АТЫН ЖАЗЫНЫЗ:");
            String a = scanner.nextLine();
            Planet planet = Planet.valueOf(a.toUpperCase());
            switch (planet) {
                case MARS:
                    System.out.println("МАРС БИЗДИН ПЛАНЕТАГА ОКШОШ ПЛАНЕТА!");
                    break;
                case EARTH:
                    System.out.println("БИЗ ЖАШАГАН ПЛАНЕТА !");
                    break;
                case VENUS:
                    System.out.println("ЭН АЛЫСКЫ ПЛАНЕТА ");
                    break;
                case SATURN:
                    System.out.println("ШАКЕКЧЕЛЕРИ БАР ЭН ЭЛЕ КООЗ ПЛАНЕТА!");
                    break;
                case JUPITER:
                    System.out.println("КУН СИСТЕМАСЫНДАГЫ ЭН ЧОН ПЛАНЕТА!");
                    break;
                default:
                    System.out.println("КАТА !!!");
            }


        }
    }
}