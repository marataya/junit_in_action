package testing_with_junit.migrating_from_junit4_to_junit5.lifecycle;

public class ResourceForAllTests {
    private String resourceName;

    public ResourceForAllTests(String resourceName) {
        this.resourceName = resourceName;
        System.out.println(resourceName + " from class " + getClass().getSimpleName() + " is initializing.");
    }

    public void close() {
        System.out.println(resourceName + " from class " + getClass().getSimpleName() + " is closing.");
    }

}
