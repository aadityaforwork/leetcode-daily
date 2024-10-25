

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        String parent = folder[0];
        result.add(parent);
        
        for (int i = 1; i < folder.length; i++) {
            
            if (!folder[i].startsWith(parent + "/")) {
              
                parent = folder[i];
                result.add(parent);
            }
        }
        
        return result;
    }
}
