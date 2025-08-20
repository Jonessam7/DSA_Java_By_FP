package August20_JAVA03.Recrusion;

import java.util.*;

public class LeaderInArray {
	public static List<Integer> Leader(int[] leads, int index,int maxSoFar, List<Integer> ans){
		if(index == 0){
			return ans;
		}
		if (leads[index] >= maxSoFar) {
			ans.add(0, leads[index]);  // add at front to maintain order
			maxSoFar = leads[index];
		}


		return Leader(leads,index -1,maxSoFar,ans);
	}
	public static List<Integer> callLeader(int[] leads) {
		List<Integer> ans = new ArrayList<>();
		return Leader(leads, leads.length - 1, Integer.MIN_VALUE, ans);
	}

	public static void main(String[] args) {
		int[] lead = {1,2,5,3,1,2};
	List<Integer> ans=	callLeader(lead);
		System.out.println(ans);
	}
}
