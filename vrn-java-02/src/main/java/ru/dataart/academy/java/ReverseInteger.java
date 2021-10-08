package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber){
        long reversedNumber = 0;
        boolean isNegativeInputNumber = inputNumber < 0;

        inputNumber = Math.abs(inputNumber);

        while (inputNumber != 0){
            reversedNumber *= 10;
            reversedNumber += inputNumber % 10;

            inputNumber /= 10;
        }

        if (isNegativeInputNumber)
            reversedNumber *= -1;

        if (reversedNumber > Integer.MAX_VALUE)
            throw new RuntimeException("Reversed number is greater then " + Integer.MAX_VALUE);
        if (reversedNumber < Integer.MIN_VALUE)
            throw new RuntimeException("Reversed number is less then " + Integer.MIN_VALUE);


        return (int)reversedNumber;
    }
}
