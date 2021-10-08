package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 3 (dnm)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int maxLength = 0;
        int leftBound = 0;
        int[] cnt = new int[26];

        // идея - два указателя, асимптотика О(n)
        for (int rightBound = 0; rightBound < checkString.length(); rightBound++ ){
            int i = checkString.charAt(rightBound) - 'a';

            cnt[i]++;

            while (cnt[i] > 1){ // пока в строке есть одинаковые символы - сдвигаем ее начало вправо
                int j = checkString.charAt(leftBound) - 'a';
                cnt[j]--;
                leftBound++;
            }

            maxLength = Math.max(rightBound - leftBound + 1, maxLength);
        }

        return maxLength;
    }
}
