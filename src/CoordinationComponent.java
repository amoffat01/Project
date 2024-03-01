import java.util.List;

public class CoordinationComponent {

    private DataStorageComponent dataStorageComponent;
    private ComputeComponent computeComponent;

    public CoordinationComponent(DataStorageComponent dataStorageComponent, ComputeComponent computeComponent) {
        this.dataStorageComponent = dataStorageComponent;
        this.computeComponent = computeComponent;
    }

    public WriteResult startComputation(String inputLocation, String outputLocation) {
            List<Integer> inputIntegers = dataStorageComponent.readIntegers(inputLocation); //reading in the integers
            List<Long> results = computeComponent.calculateFactorials(inputIntegers); //passing integers to the computational component
            dataStorageComponent.writeResults(outputLocation, results); //ask for the data storage to write the results of the computation
            return null;
    }
}
