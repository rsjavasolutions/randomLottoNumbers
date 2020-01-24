import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Run {

    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> randomLottoNumbers = new HashSet<>();

        while (randomLottoNumbers.size() < 6){
            randomLottoNumbers.add(random.nextInt(49)+1);
        }

        System.out.println(randomLottoNumbers);

    }

}
