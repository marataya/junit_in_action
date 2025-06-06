package testing_with_junit.core_concepts.assumptions.environment;

public class TestsEnvironment {
    private JavaSpecification javaSpecification;
    private OperationSystem operationSystem;

    public TestsEnvironment(JavaSpecification javaSpecification, OperationSystem operationSystem) {
        this.javaSpecification = javaSpecification;
        this.operationSystem = operationSystem;
    }

    public boolean isLinux() {
        return operationSystem.getName().contains("Linux");
    }

    public boolean isAmd64Architecture() {
        return operationSystem.getArchitecture().equals("amd64");
    }

    public String getJavaVersion() {
        return javaSpecification.getVersion();
    }

}
