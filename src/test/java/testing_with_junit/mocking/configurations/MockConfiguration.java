package testing_with_junit.mocking.configurations;

public class MockConfiguration implements Configuration {

    public void setSQL(String sqlString) {
    }

    @Override
    public String getSQL(String sqlString) {
        return null;
    }
}
