import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> nums=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            nums.add(sc.nextInt());
        }
        nums.add(8);
        System.out.println(nums);
        System.out.println(nums.get(2));
        nums.set(2,100);
        System.out.println(nums);
        nums.remove(3);
        nums.set(2,100);
        System.out.println(nums);
    }
}