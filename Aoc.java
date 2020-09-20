import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;


class Aoc {
    public static void main(String args[]) throws Exception {

        File file = new File("cisla.txt");
        Scanner sc = new Scanner(file);
        List<Integer> ListOfNum = new ArrayList<>();

        while (sc.hasNext()) {
            int number = sc.nextInt();
            ListOfNum.add(number);
        }
        
        System.out.println(ListOfNum.stream().mapToDouble(i -> Math.floor(i/3) -2).sum());
    }
}
