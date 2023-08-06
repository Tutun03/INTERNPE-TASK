import java.util.HashMap;
import java.util.Map;

public class task1d {
    public static void main(String[] args) {
        int []arr={1,3,4,6,7,3};
        HashMap<Integer,Integer> hx=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hx.containsKey(arr[i]))
            {
                hx.put(arr[i],hx.get(arr[i])+1);
            }
            else {
                hx.put(arr[i],1);
            }

        }
        for(Map.Entry<Integer,Integer> ni:hx.entrySet())
        {
            if(ni.getValue()>1)
            {
                System.out.println(ni.getKey());
            }
        }
    }
}
