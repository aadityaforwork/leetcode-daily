class Solution {
    public String compressedString(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }
        
        StringBuilder comp = new StringBuilder();
        int count = 1;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                comp.append(dingDong(word.charAt(i), count));
                count = 1; 
            }
        }
        
      
        comp.append(dingDong(word.charAt(word.length() - 1), count));

        return comp.toString();
    }

    private String dingDong(char character, int count) {
        StringBuilder result = new StringBuilder();
        
        
        while (count > 9) {
            result.append("9").append(character);
            count -= 9;
        }
    
        if (count > 0) {
            result.append(count).append(character);
        }
        
        return result.toString();
    }
}
