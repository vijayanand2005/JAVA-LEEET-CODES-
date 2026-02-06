class Solution {

    public String gcdOfStrings(String str1, String str2) {

        String answer = "";

        // Check all possible lengths
        for (int i = 1; i <= Math.min(str1.length(), str2.length()); i++) {

            // Take prefix from str1
            String part = str1.substring(0, i);

            // Check if part fully divides both strings
            if (str1.replace(part, "").equals("") &&
                str2.replace(part, "").equals("")) {

                answer = part; // keep updating largest valid string
            }
        }

        return answer;
    }
}
