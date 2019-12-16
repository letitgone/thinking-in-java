# Thinking in java(Fourth Edition)
    thinking in java notes
## Chapter 4: 控制执行流程
### 4.1 true和false
1.Java不允许我们将一个数字作为布尔值使用。
### 4.2 if-else
### 4.3 迭代
1.while,do-while,for用来控制循环，有时将它们划分为迭代语句。   
2.while和do-while的唯一区别就是do-while中的语句至少会执行一次。   
3.Character.isLowerCase(c) 判断字符是否为小写字母，   
Character.isUpperCase(c) 判断字符是否为大写字母。   
4.Java里唯一用到逗号操作符的地方就是for循环的控制表达式,可以使用一系列由逗号分隔的语句，而且那些语句均会独立执行，可以在for循环内定义多个变量，但是它们必须具有相同的类型，
这种能力只限于for循环。
### 4.4 Foreach语法
### 4.5 return
1.return关键词有两方面的用途：一方面指定一个方法返回值（假设它没有void返回值），另一方面他会导致当前方法退出，并返回那个值。
### 4.6 break和continue
1.break用于强行退出循环，不执行循环中剩余的语句，而continue则停止执行当前的迭代，然后退回循环起始处，开始下一次迭代。   
2.无穷循环的第二种形式是for(;;)，编译器将while(true)和for(;;)看作是同一回事。   
### 4.7 臭名昭著的goto
1.goto起源于汇编语言的程序控制："若条件A成立，则跳到这里，否则跳到那里"，goto语句是在源码级上的跳转。   
2.Java没有goto，然而，Java也能完成一些类似于跳转的操作，这与break和continue有关，它们其实不是一个跳转，而是中断迭代语句的一种方法，
之所以把它们纳入goto问题中一起讨论，是由于它们使用了相同的机制：标签。标签是后面跟有冒号的标识符，label1: 。   
3.Java中，标签起作用的唯一的地方刚好是在迭代语句之前，在迭代之前设置标签的唯一理由是：我们希望在其中嵌套另一个迭代或者一个开关，这是由于break和continue关键词通常只能中断当前循环，
但若随同标签一起使用，它们就会中断循环，直到标签所在的地方。   
label1:   
    >outer-iteration {   
      >>>inner-iteration {   
        >>>//...   
        >>>break; // (1)   
        >>>//...   
        >>>continue; // (2)   
        >>>//...   
        >>>continue label1; // (3)   
        >>>//...   
        >>>break label1; // (4)   
 }    
}  
(1)处：break中断内部迭代，回到外部迭代；   
(2)处：continue使执行点移回内部迭代的起始处；   
(3)处：continue label1同时中断内部迭代以及外部迭代，直接跳转到label1处，随后，它实际上是继续迭代过程，但却从外部迭代开始；   
(4)处：break label1也会中断所有迭代，并回到label1处，但并不重新进入迭代，也就是说，它实际是完全中止了两个迭代。   
4.(1)一般的continue会回退最内层循环的开头（顶部），并继续执行；   
(2)带标签的continue会达到标签的位置，并重新进入紧接在那个标签后面的循环；   
(3)一般的break会中断并跳出当前循环；   
(4)带标签的break会中断并跳出标签所指的循环。   
5.在Dijkstra的《Goto有害》的论文中，他最反对的就是标签，而非goto，标签和goto的增多会导致错误越来越多，程序难以分析，但是Java不会造成这种问题，
因为它们的应用场合已经收到限制，因此通过限制语句的能力，反而能使一项语言特性更加有用。
### 4.8 switch
1.switch语句格式如下：   
```
switch(integral-selector) {
       case integral-value1 : statement; break;
       case integral-value2 : statement; break;
       case integral-value3 : statement; break;
       case integral-value4 : statement; break;
       case integral-value5 : statement; break;
       // ...
       default: statement;
 }
 ```
 其中integral-selector（整数选择因子）是一个能够产生整数值的表达式，switch能将这个表达式的结果与每个integral-value（整数值）进行比较，
 若发现相符的，就执行对应的语句（单一语句或多条语句，其中并不需要括号），若没有相符的，就执行default语句。   
 2.每个case均以一个break结尾，这样可使执行流程跳转到switch主体的末尾，这是传统方式，但是break是可选的，如果省略break，会继续执行后面的case语句
 直到遇到一个break为止，注意最后的default语句并没有break，因为执行流程已到了break的跳转的目的地，如果考虑到编程风格，可以加上break，但是并没有
 什么实际的作用。   
 3.switch的选择因子必须是int或者char这样的整数值，如果是double，String或者float就不能执行，但是可以陪着enum来减少限制。(switch能作用在char、
 byte、short、int及其对应的包装类，不能作用在long、double、float、boolean及其对应的包装类,JDK1.7后可以作用在string上,switch中可以是枚举类型)。   
 
