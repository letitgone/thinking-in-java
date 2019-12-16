# Thinking in java(Fourth Edition)
    thinking in java notes
## Chapter 20 注解
1.注解（也称为元数据）为我们在代码中添加信息提供了一种形式化的方法，使我们可以在稍后某个时刻非常方便地使用这些数据。   
2.@Override:表示当前的方法定义将覆盖超类中的方法，如果你不小心拼写错误，或者方法签名对不上被覆盖的方法，编译器就会
发出错误提示。   
@Deprecated：如果程序员使用了注解为它的元素，那么编译器会发出警告信息。   
@SuppressWarnings：关闭不当的编译器警告信息。   
### 20.1 基本语法
1.注解也会被编译成class文件。   
2.除了@符号以外，@Test的定义很像一个空的接口，定义注解时，会需要一些元注解（meta-annotation）如@Target，@Retention。
```java
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}
```
@Target：用来定义你的注解将应用于什么地方（例如，一个方法或者一个域）；   
@Retention：用来定义该注解在那一个级别可用，在源代码中（SOURCE），类文件中（CLASS），或者运行时（RUNTIME）。   
3.没有元素的注解成为标记注解，例如上面的@Test。   
4.注解：   
1）@Target表示该注解可以用于什么地方，可能的ElementType参数包括：   
CONSTRUCTOR: 构造器的声明；
FIELD: 域声明（包括enum实例）；
LOCAL_VARIABLE: 局部变量声明；
METHOD: 方法声明；
PACKAGE: 包声明；
PARAMETER: 参数声明；
TYPE: 类，接口（包括注解类型）或enum声明。   
2）@Retention：表示需要在什么级别保存该注解信息，可选的RetentionPolicy参数包括：   
SOURCE: 注解将被编译器丢弃；
CLASS: 注解在class文件中可用，但会被VM丢弃；
RUNTIME: VM将在运行期也保留注解，因此可以通过反射机制读取注解的信息。   
3）@Documented：将此注解包含在JavaDoc中。   
4）@Inherited：允许子类继承父类中的注解。   
### 20.2 编写注解处理器
1.注解元素可用的类型：所有基本类型，String，Class，enum，Annotation，以上类型的数组。   
2.注解可以嵌套。   
3.元素不能有不确定的值，也就是说，元素必须要么有默认值，要么在使用注解时提供元素的值，对于非基本类型的元素，无论是在
源代码中声明，还是在注解接口中定义默认值时，都不能以null作为其值。   
4.不能使用关键字extends来继承某个@interface。   
### 20.3 使用apt处理注解
### 20.4 将观察者模式用于apt
### 20.5 基于注解的单元测试
