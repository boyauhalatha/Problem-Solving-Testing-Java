/*
 * INPUT:
 * 6
 * eat tea tan ate nat bat
 *
 * OUTPUT:
 * Grouped Anagrams:
 * [[eat, tea, ate], [tan, nat], [bat]]
 *
 * Given an array of strings, group the anagrams together.
 */
package Week2;
import java.util.*;
class Task7GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n=sc.nextInt();
        String[] strs=new String[n];
        System.out.println("Enter strings:");
        for(int i=0;i<n;i++){
            strs[i]=sc.next();
        }
        Task7GroupAnagrams obj=new Task7GroupAnagrams();
        List<List<String>> result=obj.groupAnagrams(strs);
        System.out.println("Grouped Anagrams:");
        System.out.println(result);
        sc.close();
    }
}