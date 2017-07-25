import org.junit.Test;

/**
 * Created by jagtapm on 7/24/2017.
 */
@Company(name = "CDK", location = "Pune")
@Timestamp(weekDay = Day.MONDAY, month = Month.JULY, year = Year.YEAR_2017)
public class AnnotationTest {

    @Test
    public void annotationTest() {
        @Timestamp(weekDay = Day.FRIDAY, month = Month.JULY, year = Year.YEAR_2017)
        int a, b;
        System.out.println("Annotation test");
    }

}
