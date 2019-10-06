class LongestConsecutiveIncreasingSubstring {
    public String getLongestConsecutiveIncreasingSubstring(String word) {
        if (word.length() < 2) {
            return word;
        }

        int resIndex = 0;
        int bPtr = 0;
        int prev = 0;
        int ePtr = 1;
        int len = 0;
        int prevLen = 0;

        while (ePtr < word.length()) {
            if (word.charAt(ePtr) >= word.charAt(prev)) {
                len++;
                prev++;
                ePtr++;
            } else {
                if (len + 1 > prevLen) {
                    resIndex = bPtr;
                    prevLen = len + 1;
                }

                len = 0;
                bPtr = ePtr;
                prev = bPtr;
                ePtr++;
            }
        }

        if (len + 1> prevLen) {
            resIndex = bPtr;
            prevLen = len + 1;
        }

        return word.substring(resIndex, resIndex + prevLen);
    }
    public static void main(String args[]) {
        String test1 = "abcabcdgabxy";
        String test2 = "abcabcdgabmnsxy";

        LongestConsecutiveIncreasingSubstring lcis = new LongestConsecutiveIncreasingSubstring();
        System.out.println(test1 + ": " + lcis.getLongestConsecutiveIncreasingSubstring(test1));
        System.out.println(test2+ ": " + lcis.getLongestConsecutiveIncreasingSubstring(test2));
    }
}