public class FizzBuzz {

    public static String getFizzBuzz(int number){
        boolean isFizzNumber = number % 3 == 0;
        boolean isBuzzNumber = number % 5 == 0;

        if (isFizzNumber && isBuzzNumber) {
            return "FizzBuzz";
        }

        if (isFizzNumber) {
            return "Fizz";
        }

        if (isBuzzNumber) {
            return "Buzz";
        }
        return String.format("%d", number);
    }
}
