
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        
        while (left <= right) {
            // If the lightest and heaviest person can fit together, pair them
            if (people[left] + people[right] <= limit) {
                left++;
            }
            
            // The heaviest person is always allocated to a boat
            right--;
            boats++;
        }
        
        return boats;
    }
}