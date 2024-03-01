import java.util.ArrayList;
import java.util.List;

class ComputeComponent {

    public List<Long> calculateFactorials(List<Integer> inputIntegers) {
        List<Long> resultsOfFactorials = new ArrayList<>();

        for (int n : inputIntegers) {
            int factorial = calculateFactorial(n);
            WriteResult.add(factorial);
        }

        return resultsOfFactorials;
    }

    private int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
