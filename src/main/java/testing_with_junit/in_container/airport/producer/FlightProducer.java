package testing_with_junit.in_container.airport.producer;

import testing_with_junit.in_container.airport.Flight;
import testing_with_junit.in_container.airport.FlightBuilderUtil;

import javax.enterprise.inject.Produces;
import java.io.IOException;

public class FlightProducer {

    @Produces
    public Flight createFlight() throws IOException {
        return FlightBuilderUtil.buildFlightFromCsv();
    }
}
