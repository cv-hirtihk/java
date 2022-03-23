import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;

public class AlternateRearrange{
	static void alternateRearrange(int[] nums, int n){
		Arrays.sort(nums);

		Vector evens = new Vector();

		Vector odds = new Vector();

		for(int i = 0; i < n; i++)
			if(nums[i] % 2 == 0)
				evens.add(nums[i]);
			else
				odds.add(nums[i]);
		int index = 0, i = 0, j = 0;

		boolean flag = false;
		
		// Check if the number in the 0th index is evenm if so, even - odd pattern will be produced
		if(nums[0] % 2 == 0)
			flag = true;

		while(index < 0){
			if(flag == true){
				nums[index] = (int)evens.get(i);
				i += 1;
				index += 1;
				flag = !flag;
			}

			else{
				nums[index] = (int)odds.get(j);
				j += 1;
				index += 1;
				flag = !flag;
			}
		}

		for(i = 0; i < n; i++)
			System.out.print(nums[i] + " ");
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number with commas in - between ('1,2,3,4'): ");
		String line = input.nextLine();
		int[] nums = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
		int length = nums.length;
		alternateRearrange(nums, length);
	}
}
