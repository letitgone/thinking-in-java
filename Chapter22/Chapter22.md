# Thinking in java(Fourth Edition)
    thinking in java notes
## Chapter 22 图形化用户界面
1.Java 1.0 版本中的图形用户界面（graphical user interface, GUI）库，其最初的设计目标是帮助程序员编写在所有平台
上都能良好表现的GUI程序。   
2.Java 2完成了一些转换，其中有关GUI的部分被称为"Swing"，Swing是一组易于使用，易于理解的JavaBeans，它能够通过拖放
操作（也可以通过手工编写）来创建合理的GUI程序。   
3.Swing包含了所有你希望在流行的用户界面中看到的组件：从带图片的按钮，到树形和表格组件，这个库虽然庞大，但它的设计理
念是：使用组件的复杂程度与任务的难度相匹配，如果任务很简单，你不用写很多代码，但对于复杂的工作，就要写复杂的代码才行。   
### 22.1 applet
1.applet是一种可以在Internet傻上传递，并在Web浏览器中运行的程序（出于安全性，只能在所谓的沙盒内运行）。
### 22.2 Swing基础
### 22.3 创建按钮
1.创建按钮用：JButton。   
2.布局管理器（FlowLayout）：是面板用来隐式地决定控件在窗体上的位置的工具
### 22.4 捕获事件
### 22.5 文本区域
### 22.6 控制布局
### 22.7 Swing事件模型
### 22.8 Swing组件一览
### 22.9 JNLP与Java Web Start
### 22.10 Swing与并发
1.当你在用Swing编程时，就是在使用线程，通过SwingUtilities.invokeLater()提交给Swing事件分发线程，但是不用显式的
创建Thread对象，存在着一个Swing事件分发线程，它始终在那里，通过从事件队列中拉出每个事件并以此执行它们，来处理所有的
Swing事件。   
### 22.11 可视化编程与JavaBean
### 22.12 Swing的可替代选择
### 22.13 用于Flex构建Flash Web客户端
### 22.14 创建SWT应用
