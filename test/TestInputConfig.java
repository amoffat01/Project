import java.util.ArrayList;
import java.util.List;

public class TestInputConfig implements Input {
    private final List<Integer> integers;

    public TestInputConfig(List<Integer> integers) {
        this.integers = new ArrayList<>(integers);
    }

    public List<Integer> getIntegers() {
        return new ArrayList<>(integers);
    }
}
