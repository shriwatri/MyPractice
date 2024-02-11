import java.util.Arrays;

public class BitwiseTwoElementExistsOne {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 1, 2, 4};
		System.out.println(Arrays.toString(solve(A)));
	}
	public static int[] solve(int[] A) {
        int[] ans = new int[2];
        int v = 0;
        //Step1: XOR of entire array
        for(int i = 0; i < A.length; i++){
            v = v^A[i];
        }
        //Step2. From 'v' get the first set bit level from right.
        int pos =0;
        for(int i =0;i < 31; i++){
            if(checkBit(v,i)){
                pos = i;
                break;
            }
        }
        //Step3: Split the entire array an on the last of 'pos' bit level
        int set =0, unset =0;
        for(int j =0; j <A.length; j++){
            if(checkBit(A[j],pos)){
                set = set^A[j];
            }else{
                unset ^= A[j];
            }
        }
        ans[0] = Math.min(set,unset);
        ans[1] = Math.max(set,unset);
        return ans;
    }
    public static  boolean checkBit(int N,int i){
        if((N & (1<<i))==0){
            return false;
        }else{
            return true;
        }
    }

}
