package testing_with_junit.migrating_from_junit4_to_junit5.lifecycle;

public class SUT {
    private final String systemName;


    public SUT(String systemName) {
        this.systemName = systemName;
        System.out.println(systemName + " from class " + this.getClass().getSimpleName() + " is initialized.");
    }

    public boolean canReceiveRegularWork() {
        System.out.println(systemName + " from class " + this.getClass().getSimpleName() + " can receive regular work.");
        return true;
    }

    public boolean canReceiveAdditionalWork() {
        System.out.println(systemName + " from class " + this.getClass().getSimpleName() + " cannot receive additional work.");
        return false;
    }

    public void close() {
        System.out.println(systemName + " from class " + this.getClass().getSimpleName() + " is closing.");
    }
}
