# Thinking in java(Fourth Edition)
    thinking in java notes
## Chapter 15 泛型
1.泛型实现了参数化类型的概念，泛型这个术语的意思是："适用于许多许多的类型"。
### 15.1 与C++比较
### 15.2 简单泛型
1.泛型的主要目的之一就是：用来指定容器要持有什么类型的对象，而且由编译器来保证类型的正确性。   
2.类型参数：用尖括号括住，T就是类型参数，例如：section_01.Holder3<T>。   
3.从Holder3中取出它持有的对象时，自动就是正确的类型
```
section_01.Holder3<section_01.Automobile> h3 = new section_01.Holder3<section_01.Automobile>(new section_01.Automobile());
section_01.Automobile a = h3.get(); // No cast needed
```   
4.这就是Java泛型的核心概念：告诉编译器想使用什么类型，然后编译器帮你处理一切细节。   
5.一般而言，你可以认为泛型与其他类型差不多，只不过它们碰巧有类型参数罢了。   
6.元组(tuple):它是将一组对象直接打包存储于其中的一个单一对象，这个容器允许读取其中元素，但是不允许向其中存放新的对象
（这个概念也称为数组传递对象，或者信使），通常，元组可以具有任意长度，元组中的对象可以是任意不同的类型
### 15.3 泛型接口
1.泛型也可以用于接口。
### 15.4 泛型方法
1.是否拥有泛型方法，与其所在的类是否是泛型没有关系。   
2.一个基本原则：无论何时，只要你能做到，你就应该尽量使用泛型方法。   
3.要定义泛型方法，只需将泛型参数列表置于返回值之前。   
4.泛型方法通常不必指明参数类型，因为编译器会为我们找出具体的类型，这称为类型参数推断。   
5.如果传入基本类型，自动打包机制就会介入其中，将基本类型的值包装为对应的对象。   
### 15.5 匿名内部类
1.泛型还可以应用于内部类以及匿名内部类。
### 15.6 构建复杂模型
1.泛型的一个重要好处是能够简单而安全地创建复杂模型。
### 15.7 擦除的神秘之处
1.在泛型代码内部，无法获取任何有关泛型参数类型的信息，因此，你可以知道诸如类型参数标识符和泛型类型边界这类信息，你却
无法知道用来创建某个特定实例的实际的类型参数。   
2.Java泛型是使用擦除来实现的，这意味着当你在使用泛型时，任何具体的类型信息都被擦除了，你唯一知道的就是你在使用一个对
象。   
```C++
//: generics/Templates.cpp
#include <iostream>
using namespace std;
template<class T> class Manipulator {
  T obj;
public:
  Manipulator(T x) { obj = x; }
  void manipulate() { obj.f(); }
};
class HasF {
public:
  void f() { cout << "HasF::f()" << endl; }
};
int main() {
  HasF hf;
  Manipulator<HasF> manipulator(hf);
  manipulator.manipulate();
} /* Output:
HasF::f()
///:~
```
3.T和？运用的地方有点不同,?是定义在引用变量上,T是类上或方法上。   
4.class Manipulator<T extends HasF>。   
5.只有当你希望使用的类型参数比某个具体类型（以及它的所有子类型）更加"泛化"时，也就是说，当你希望代码能够跨多个类工作
时，使用泛型才有所帮助。   
6.在泛型中创建数组，使用Array.newInstance()是推荐的方式。   
### 15.8 擦除的补偿
1.任何运行时需要知道确切类型信息的操作都将无法工作，例如：instanceof   
2.成功创建泛型数组的唯一方式就是创建一个被擦除类型的新数组。   
3.因为有了擦除，数组的运行时类型就是能是Object[]。
### 15.9 边界
1.将参数限制为某个类型子集，extends。
### 15.10 通配符
1.数组的一种特殊行为：可以向导出类型的数组赋予基类型的数组引用。   
2.数组对象可以保留有关它们包含的对象类型的规则，就好像数组对它们持有的对象是有意识的。   
3.在运行时可以发现你已经插入了不正确的类型，但是泛型的主要目标之一是将这种错误检测移入到编译期。   
4.使用泛型代替数组：
```
  public class NonCovariantGenerics {
    // Compile Error: incompatible types:
    List<Fruit> flist = new ArrayList<Apple>();
```   
不能把一个涉及Apple的泛型赋值给一个涉及Fruit的泛型。   
它拒绝向上转型，然而这根本就不是向上转型，Apple的List不是Fruit的List，Apple的List将持有Apple和Apple等等子类型，
而Fruit将持有任何类型的Fruit，诚然，这包括Apple在内，但是它不是一个Apple的List，它仍旧是Fruit的List，Apple的
List在类型上不等价于Fruit的List，即使Apple是一种Fruit类型。   
5.真正的问题是我们在谈论容器的类型，而不是容器持有的类型。   
6.List<? extends Fruit>，你可以理解为"具有任何从Fruit继承的类型的列表"，但实际上并不意味着这个List将持有任何类型
的Fruit。   
7.Number类是java.lang包下的一个抽象类，提供了将包装类型拆箱成基本类型的方法，所有基本类型的包装类型都继承了该抽象类,
并且是final声明不可继承改变；   
### 15.11 问题
1.任何基本类型都不能作为参数类型，可以使用金额类型的包装类。
### 15.12  自限定的类型
1.自限定的参数有何意义：它可以保证类型参数必须与正在被定义的类相同。
### 15.13 动态类型安全
### 15.14 异常
### 15.15 混型
1.混型：混合多个类的能力，以产生一个可以表示混型中所有类型的类，它们可以将特性和行为一致地应用于多个类之上。
### 15.16 潜在类型机制
### 15.17 对缺乏潜在类型机制的补偿
### 15.18 将函数对象用作策略
### 15.19 总结：转型真的如此之糟吗
1.使用泛型类型机制的最吸引人的地方，就是在使用容器类的地方。
2.泛型是一种方法，通过它可以编写出更加"泛化"的代码，这些代码对于它们能够作用的类型具有更少的限制，因此单个的代码段可
以应用到更多的类型上
