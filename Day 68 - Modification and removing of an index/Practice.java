import java.util.*;
public class Practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> nums=new ArrayList <>();
        for(int i=0;i<n;i++)
        {
            nums.add(sc.nextInt());
        }
        nums.add(99);
        System.out.println(nums);

        nums.set(1,500);
        System.out.println(nums);

        nums.remove(nums.size()-1);
        System.out.println(nums);

        System.out.println(nums.size());




    }
    
}
