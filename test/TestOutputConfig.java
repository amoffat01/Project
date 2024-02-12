public class TestOutputConfig implements Output {
    private final List<String> writableStrings;

    public TestOutputConfig() {
        this.writableStrings = new ArrayList<>();
    }

    public List<String> getWritableStrings() {
        return new ArrayList<>(writableStrings);
    }

    public void addWritableString(String writableString) {
        writableStrings.add(writableString);
    }
}
