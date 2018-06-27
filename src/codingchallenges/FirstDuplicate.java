package codingchallenges;

import java.util.HashSet;

public class FirstDuplicate {

	public FirstDuplicate() {}
	
	public int findFirstDuplicate(int[] a) {
		HashSet<Integer> s = new HashSet<Integer>();
	    for(int i=0;i<a.length;i++){
	        s.add(a[i]);
	        if(s.size()==i){
	            return a[i];
	        }
	    }
	    return -1;
	}
}
