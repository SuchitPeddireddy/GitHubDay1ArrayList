import java.util.ArrayList;

public class GitHubArrayListDay1{

	public static ArrayList combineArrayList(ArrayList<Integer> x, ArrayList<Integer> y){
		 ArrayList<Integer> both = new ArrayList<>();

		 for(int i = 0; i < x.size(); i++){
			 both.add(x.get(i));
		 }
		 for(int i = 0; i < y.size(); i++){
			 both.add(y.get(i));
		 }

		 return both;
	}

	public static void main(String[]args){

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 0; i < 10; i++){
			list1.add(i);
			list2.add(i+10);
		}

		System.out.print(combineArrayList(list1, list2));






	}
}