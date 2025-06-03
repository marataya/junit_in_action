package testing_with_junit.mocking.configurations;

public class DefaultConfiguration implements Configuration {

    public DefaultConfiguration(String configurationName) {
    }

    @Override
    public String getSQL(String sqlString) {
        return null;
    }
}
