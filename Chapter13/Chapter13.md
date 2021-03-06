# Thinking in java(Fourth Edition)
    thinking in java notes
## Chapter 13: 字符串
### 13.1 不可变String
1.String对象是不可变的。   
2.每当把String对象作为方法的参数时，都会复制一份引用，而该引用所指的对象其实一直待在单一的物理位置上，从未动过。
### 13.2 重载 "+" 与StringBuilder
1.StringBuilder是Java SE5引入的，在这之前Java用的是StringBuffer。后者是线程安全的，速度比较慢，开销也会大些。
### 13.3 无意识的递归
1.Java中的每个类从根本上都是继承自Object，标准容器类自然也不例外，因此容器类都有toString()方法，并且覆写了该方法，
使得它生成的String结果能够表达容器自身，以及容器所包含的对象。   
### 13.4 String上的操作
1.当需要改变字符串的内容时，String类的方法都会返回一个新的String对象，同时，如果内容没有发生改变，String的方法只是
返回指向原对象的引用而已，这可以节约存储空间以及避免额外的开销。 
### 13.5 格式化输出
1.printf()
```
printf("ROW 1: [%d %f]\n", x, y);
```
这一行代码在运行的时候，首先将x的值插入到%d的位置，然后将y的值插入到%f的位置，这些占位符称作格式修饰符（%d表示x是一
个整数，%f表示y是一个浮点数）。   
2.precision应用于String时，它表示打印String时输出字符的最大数量，而在将precision应用于浮点数时，它表示小数部分
要显示出来的位数（默认时6位小数），如果小数位数过多则舍入，太少则补零，由于整数没有小数部分，所以precision无法应用于
整数。
### 13.6 正则表达式
1.正则表达式是一种强大而灵活的文本处理工具，使用正则表达式，我们能够以编程的方式，构造复杂的文本模式，并对输入的字符
串进行搜索，一旦找到了匹配这些模式的部分，你就能够随心所欲地对它们进行处理，正则表达式提供了一种完全通用的方式，能够
解决各种字符串处理的相关问题：匹配，选择，编辑以及验证。   
2.正则表达式就是以某种方式来描述字符串，因此你可以说"如果一个字符串含有这些东西，那么它就是我正在找的东西"。
3.导入java.util.regex包，然后用static Pattern.compile()方法来编译你的正则表达式，它会根据你的String类型的正则
表达式生成一个Pattern对象，接下来，把你想要检索的字符串传入Pattern对象的matcher()方法，matcher()方法会生成一个
Matcher对象，它有很多功能。 
### 13.7 扫描输入
1.默认情况下，Scanner根据空白字符对输入进行分词，但你可以用正则表达式指定自己所需的定界符。   
2.我们可以使用useDelimiter()来设置定界符，同时，还有一个delimiter()方法，用来返回当前正在作为定界符使用的Pattern
对象。   
3.除了能够扫描基本类型之外，你还可以使用自定义的正则表达式进行扫描。   
4.在配合正则表达式使用扫描时，有一点需要注意：它仅仅针对下一个输入分词进行匹配，如果你的正则表达式中含有定界符，那永远
都不可能匹配成功。
### 13.8 StringTokenizer
1.在Java引入正则表达式和Scanner之前，分割字符串使用的是StringTokenizer。   
