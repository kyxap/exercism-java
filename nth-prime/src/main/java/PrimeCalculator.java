import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

    private int sieve;


    public ArrayList<Integer> getPrimes() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> booList = new ArrayList<>();
        ArrayList<Integer> rezList = new ArrayList<>();
        for (int i = 2; i <= this.sieve; i++){
            list.add(i);
            booList.add(true);
        }

        //boolean list vs list 2 to sieve
        int count = 0;
        for (boolean x : booList) {
            if (true) {
                int el = list.get(count);
                if (list.contains(el * el)) {
                    int j = list.indexOf(el * el);
                    while (j <= booList.size() -1){
                        booList.set(j, false);
                        j += el;
                    }
                } else {
                    continue;
                }
            }
            count++;
        }
        int index = 0;
        for (boolean x : booList){
            if (x) {
                rezList.add(list.get(index));
            }
            index++;
        }
        return rezList;
    }

    public int nth(int i) {
        if (i < 1){
            throw new IllegalArgumentException();
        }
       this.sieve = i * 15;
       return getPrimes().get(i - 1);

    }
}
