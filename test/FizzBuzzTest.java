import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wyli on 16/11/22.
 */
public class FizzBuzzTest {

    @Test
    public void should_return_normal_number_given_input_is_1() {
        int number = 1;
        String fizzBuzz = FizzBuzz.getFizzBuzz(number);
        assertEquals("1", fizzBuzz);
    }

    @Test
    public void should_return_Fizz_given_input_is_6(){
        int number = 6;
        String fizzBuzz = FizzBuzz.getFizzBuzz(number);
        assertEquals("Fizz", fizzBuzz);
    }

    @Test
    public void should_return_Buzz_given_input_is_5(){
        int number = 5;
        String fizzBuzz = FizzBuzz.getFizzBuzz(number);
        assertEquals("Buzz", fizzBuzz);
    }

    @Test
    public void should_return_FizzBuzz_given_input_is_15(){
        int number = 15;
        String fizzBuzz = FizzBuzz.getFizzBuzz(number);
        assertEquals("FizzBuzz", fizzBuzz);
    }
}