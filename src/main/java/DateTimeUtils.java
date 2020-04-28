import java.sql.Date;
import java.time.*;

public class DateTimeUtils {
  public static void main(String[] args) {
    Long givenTimeStamp = 1582984577000L;
    YearMonth yearmonthCheck = YearMonth.of(2020,2);

    ZoneId timeZoneLocal = ZoneOffset.of("+7"); // Use whichever time zone makes sense for your use case
    java.sql.Date date = new java.sql.Date(givenTimeStamp);

    Instant instant = Instant.ofEpochMilli(date.getTime());
    LocalDateTime givenLocalDateTime = instant.atZone(timeZoneLocal).toLocalDateTime();
    YearMonth yearmonthConverted = YearMonth.from(givenLocalDateTime);
    System.out.println("yearmonthConverted: Year: " + yearmonthConverted.getYear() +", Month: "+  yearmonthConverted.getMonth());
    if(yearmonthCheck.equals(yearmonthConverted))
      System.out.println("givenLocalDateTime inside yearmonthCheck");
    else  System.out.println("givenLocalDateTime outside yearmonthCheck");;
  }
}
