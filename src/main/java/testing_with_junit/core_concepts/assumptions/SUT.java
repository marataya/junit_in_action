package testing_with_junit.core_concepts.assumptions;

public class SUT {
    private Job currentJob;

    public void run(Job currentJob) {
        this.currentJob = currentJob;
    }

    public boolean hasJobToRun() {
        return currentJob != null;
    }
}
