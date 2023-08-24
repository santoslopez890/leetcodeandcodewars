public class Solution {

    public int solution(int number) {
        //TODO: Code stuff here
        int count=0;

        for(int i=0;i<number;i++){
            if(i%3==0 || i%5==0){
                count+=i;
            }
        }
        return count;
    }
}