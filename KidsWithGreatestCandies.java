import java.util.*;

public class KidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> results = new ArrayList<>(candies.length);
        for(int i = 0; i < candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            results.add((candies[i] + extraCandies) >= max);
        }
        return results;
    }
}