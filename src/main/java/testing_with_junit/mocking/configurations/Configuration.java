package testing_with_junit.mocking.configurations;

public interface Configuration {
    /**
     * Getter method to get the SQL query to execute
     */
    String getSQL(String sqlString);
}
