package section_03;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
public class Atomicity {
    int i;

    void f1() {
        i++;
    }

    void f2() {
        i += 3;
    }
}/* Output: (Sample)
...
void f1();
Code:
0: aload_0
1: dup
2: getfield
5: iconst_1
6: iadd
7: putfield
10: return
void f2();
  Code:
0: aload_0
1: dup
2: getfield
5: iconst_3
6: iadd
7: putfield
   10:        return
*/
