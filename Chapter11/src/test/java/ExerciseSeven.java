import java.util.*;
/**
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
class IDClass {
		private static int counter;
		private int count = counter++;
		public String toString() {
				return "IDClass " + count;
		}
}
public class ExerciseSeven {
		public static void main(String args[]) {
				IDClass[] idc = new IDClass[10];
				for(int i = 0; i < idc.length; i++)
						idc[i] = new IDClass();
				List<IDClass> lst = new ArrayList<IDClass>(
						Arrays.asList(idc));
				System.out.println("lst = " + lst);
				List<IDClass> subSet =
						lst.subList(lst.size()/4, lst.size()/2);
				System.out.println("subSet = " + subSet);
				// The semantics of the sub list become undefined if the
				// backing list is structurally modified!
				//! lst.removeAll(subSet);
				subSet.clear();
				System.out.println("lst = " + lst);
		}
}
