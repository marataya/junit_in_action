package testing_with_junit.migrating_from_junit4_to_junit5.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testing_with_junit.migrating_from_junit4_to_junit5.categories.IndividualTests;
import testing_with_junit.migrating_from_junit4_to_junit5.categories.JUnit4CustomerTest;
import testing_with_junit.migrating_from_junit4_to_junit5.categories.JUnit4CustomersRepositoryTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(IndividualTests.class)
@Suite.SuiteClasses({JUnit4CustomerTest.class, JUnit4CustomersRepositoryTest.class})
public class JUnit4IndividualTestsSuite {
}
