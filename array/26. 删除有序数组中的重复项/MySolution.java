import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MySolution {
    public int removeDuplicates(int[] nums) {
        int size=nums.length;
        HashMap<Integer,Integer> countMap=new LinkedHashMap<>();
        for(Integer num : nums)
        {
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        } 
        List<Integer> keyList = new ArrayList<>(countMap.keySet());
        int arrSize=countMap.size();
        for(int i=0;i<arrSize;i++)
        {
            nums[i]=keyList.get(i);
        }
        return arrSize;
    }
    
}
