package saturdayProject7;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class yourTest {

    /*
        Create a Test for method in the Users randomNumberCreader

        Check all possible options

     */

    @Test
    public void test1() {

        int randomNumber = Users.randomNumberCreader();
        String str = String.valueOf(randomNumber);
        int actual = str.length();
        int expected = 8;

        Assert.assertEquals(expected, actual);

    }

    /*
        Create a Test for method in the Users checkAge

        Check all possible options

     */


    @Test
    public void test2() {
// age > 18
        String myDOB = "05/16/2002";

        String actual = Users.checkAge(myDOB);
        String expected = "You can get a credit card";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test3() {
// age < 18
        String myDOB = "06/17/2002";

        String actual = Users.checkAge(myDOB);
        String expected = "You should be at least 18 years old to get a credit card.";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test4() {
// age = 18 and monthOfCurrent > monthOfBirth
        String myDOB = "04/30/2002";

        String actual = Users.checkAge(myDOB);
        String expected = "You can get a credit card";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test5() {
// age = 18 and monthOfCurrent < monthOfBirth
        String myDOB = "06/01/2002";

        String actual = Users.checkAge(myDOB);
        String expected = "You should be at least 18 years old to get a credit card.";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test6() {
// age = 18 , monthOfCurrent = monthOfBirth and dayOfCurrent > dayOfBirth
        String myDOB = "05/16/2002";

        String actual = Users.checkAge(myDOB);
        String expected = "You can get a credit card";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test7() {
// age = 18 , monthOfCurrent = monthOfBirth and dayOfCurrent < dayOfBirth
        String myDOB = "05/18/2002";

        String actual = Users.checkAge(myDOB);
        String expected = "You should be at least 18 years old to get a credit card.";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test8() {
// age = 18

        LocalDate a = LocalDate.now();
        int year = a.minusYears(18).getYear();
        int month = a.getMonthValue();
        int day = a.getDayOfMonth();
        String strY = "";
        strY = strY.concat(String.valueOf(month)) + "/" + strY.concat(String.valueOf(day)) + "/" + strY.concat(String.valueOf(year));

        String myDOB = strY;
        String actual = Users.checkAge(strY);
        String expected = "You should be at least 18 years old to get a credit card.";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test9() {
// 0 < age (If customer make  a mistake )
        String myDOB = "05/17/2022";
        String actual = Users.checkAge(myDOB);
        String expected = "You should be at least 18 years old to get a credit card.";
        Assert.assertEquals(expected, actual);
    }

}
