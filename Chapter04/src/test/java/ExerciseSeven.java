/**
 * @Author ZhangGJ
 * @Date 2019/03/23
 */
public class ExerciseSeven {
		public static void main(String[] args) {
				for(int i = 1; i <= 100; i++){
						if(i == 99){
//								There is no observable difference whether you use break or return in this program.
//								return;
								break;
						}
						System.out.print(i + " ");
				}
		}
}
