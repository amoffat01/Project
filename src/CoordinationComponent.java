import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CoordinatorComponent {
    private final ComputationComponent computationComponent;
    private final ExecutorService executorService;

    public CoordinatorComponent(ComputationComponent computationComponent, int threadPoolSize) {
        this.computationComponent = computationComponent;
        this.executorService = Executors.newFixedThreadPool(threadPoolSize);
    }

    public void startComputation() {

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> computationComponent.performComputation());
        }
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
