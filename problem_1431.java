/*
1431. Kids With the Greatest Number of Candies
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies. */

class problem_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int sum,max = max_candy(candies);
        for(int i=0;i<candies.length;i++){
            sum = candies[i] + extraCandies;
            result.add(sum>=max);
        }
        return result;
    }
    int max_candy(int[] candies){
        int max = candies[0];
        for(int i = 1;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        return max;
    }
}