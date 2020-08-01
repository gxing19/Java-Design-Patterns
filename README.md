# Java-Design-Patterns
Design patterns implemented in Java(设计模式之Java实现) 。

要理解 设计模式，前提是必须深入理解面向对象的三个基本特征：封装，继承、多态。有的把 **抽象** 也作为面向对象的基本特征，抽象严格来讲应归属于 **继承**。另外就是还需要对 `高内聚、低耦合` 略有体会。

此系列是个人对设计模式的理解 和 Java 实现 Demo 的汇总，同时也参考了大量网上的资料或博文，在此表示感谢。

[设计模式系列文章](http://www.gxitsky.com/categories/设计模式/)

Gitee仓库：https://gitee.com/gxing19/Design-Patterns-Java

# 设计模式简介

GOF 四人帮出的书(Design Patterns - Elements of Reusable Object-Oriented Software（中文译名：设计模式 - 可复用的面向对象软件元素))中提到的设计模式总共有 23 种设计模式。

这些模式可以分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural Patterns）、行为型模式（Behavioral Patterns），每个大类又可细分为两个子类，分别对应 `类` 和 `对象`。

设计模式(Design Pattern) 为面向对象设计中反复出现的问题提供解决方案。是对使用 **面向对象程序语言** 进行 **面向对象设计** 而总结的方法论，代表了最佳实践，可以使得程序更具 `扩展性`、易于修改，易于复用。

# 创建型模式

创建型模式与对象的创建有关。传统的创建对象是在使用时直接 new 一个对象，此情况下，创建对象与使用对象存在耦合。创建型模式是对创建对象的过程进行抽象，将对象创建与使用进行分离，降低耦合度。

## 定义

**创建型模式**(Creational Pattern)对类的实例化过程进行了抽象封装，能够将软件模块中 `对象的创建` 和 `对象的使用分离`。为了使软件的结构更加清晰，外界对于这些对象只需要知道它们共同的接口，而不清楚其具体的实现细节，使整个系统的设计更加符合**单一职责原则**。

创建型模式在**创建什么**(What)，**由谁创建**(Who)，**何时创建**(When)等方面都为软件设计者提供了尽可能大的灵活性。创建型模式隐藏了类的实例的创建细节，通过隐藏对象如何被创建和组合在一起达到使整个系统独立的目的。

对象的创建 和 对象的使用分离，对象的创建过程封装到一个单独的类中，使用者只需要传递对象类型就可拿到所需要的对象，无须关注对象的创建过程。

## 模式

创建型模式可细分为两类：`类创建型模式` 和 `对象创建型模式`。

### 类创建型模式

1. 工厂方法模式(Factory Method)

   属性类创建型模式，定义一个用于创建产品的接口，由子类决定生产什么产品。

2. 简单工厂模式(Simple Factory)，又称为静态工厂方法模式(Static Factory Method Pattern)

   它属于类创建型模式，简单工厂模式专门定义一个类来负责创建其他类的实例，可以根据接收的不同变量来返回不同类的实例。被创建的实例通常具有共同的父类。

   示例：简单工厂类里创建实例的方法接收参数，方法里的 switch(var) 根据接收的变量执行相应的分支，在分支里执行 new 对象的创建并返回。

### 对象创建模式

1. 抽象工厂模式(Abstract Factory)

   提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。

2. 建造者模式(Builder)

   将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。

3. 原型模式(Prototype)

   将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。

4. 单例模式(Singleton)

   只创建一个实例，提供一个全局访问点供外部获取该实例。

# 结构型模式

## 定义

**结构型模式**(Structural Pattern)描述如何将 **类** 或者 **对象** 结合在一起形成更大的结构，就像搭积木，可以通过简单积木的组合形成复杂的、功能更为强大的结构。

## 模式

**结构型模式** 可以分细分为两类： `类结构型模式` 和 `对象结构型模式`。

### 类结构型模式

**类结构型模式** 关心类的组合，由多个类可以组合成一个更大的系统，一般采用继承机制来组织接口和类。

1. 适配器模式(Adapter）

   将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

### 对象结构型模式

**对象结构型模式** 关心类与对象的组合，一般采用组合或聚合来组合对象。

由于 `组合关系` 或 `聚合关系` 比 `继承关系`  耦合度低，满足 【**合成复用原则**】，所以对象 结构型模式 比 类结构型模式 具有更大的灵活性。

通过关联关系使得在一个类中定义另一个类的实例对象，然后通过该对象调用其方法。 根据 合成复用原则，在系统中尽量使用关联关系来替代继承关系，因此大部分结构型模式都是对象结构型模式。

1. 桥接模式(Bridge)

   将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现的，从而降低了抽象和实现这两个可变维度的耦合度。

2. 组合模式(Composite)

   将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。

3. 装饰模式(Decorator)

   动态地给对象增加一些职责，即增加其额外的功能。

4. 门面模式(Facade)

   为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。

5. 享无模式(Flyweight)

   运用共享技术来有效地支持大量细粒度对象的复用。

6. 代理模式(Proxy)

   为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。

# 行为型模式

## 定义

**行为型模式**(Behavioral Pattern)是对在不同的对象之间划分责任和算法的抽象化。行为型模式不仅仅关注类和对象的结构，而且重点关注它们之间的相互作用。

通过行为型模式，可以更加清晰地划分类与对象的 **职责**，并研究系统在运行时实例对象之间的交互。在系统运行时，对象并不是孤立的，它们可以通过相互通信与协作完成某些复杂功能，一个对象在运行时也将影响到其他对象的运行。

## 模式

**行为型模式** 可细分为两类：`类行为型模式` 和 `对象行为型模式`。

### 类行为模式

类的行为型模式使用 **继承** 机制在类之间分配行为，主要通过多态等方式来分配父类与子类的职责。

1. 模板方法模式（Template Method）

   定义一个操作中的算法骨架，将算法的一些步骤延迟到子类中，使得子类在可以不改变该算法结构的情况下重定义该算法的某些特定步骤。

2. 解释器模式（Interpreter）

   提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。

### 对象行为模式

对象的行为型模式使用组合或聚合关联关系在对象间分配行为，主要是通过对象关联等方式来分配两个或多个类的职责。

由于组合关系或聚合关系比继承关系耦合度低，根据【合成复用原则】，系统中要尽量使用关联关系来取代继承关系，因此大部分行为型设计模式都属于对象行为型设计模式。

1. 职责链模式（Chain of Responsibility）

   把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。

2. 命令模式（Command）

   将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。

3. 迭代器模式（Iterator）

   提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。

4. 中介者模式（Mediator）

   定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。

5. 备忘录模式（Memento）

   在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。

6. 观察者模式（Observer）

   多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。

7. 状态模式（State）

   允许一个对象在其内部状态发生改变时改变其行为能力。

8. 策略模式（Strategy）

   定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。

9. 访问者模式（Visitor）

   在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。
  
# 参考引用

1. [软件设计模式](http://c.biancheng.net/view/1317.html)
2. [图说设计模式](https://design-patterns.readthedocs.io/zh_CN/latest/)
3. [创建型模式-百度百科](https://baike.baidu.com/item/创建型模式/22912595?fr=aladdin)
4. [23种设计模式及案例](https://www.jianshu.com/p/4a5a0a92e7d5)
5. [RUNOOB：设计模式](https://www.runoob.com/design-pattern/design-pattern-tutorial.html)
6. [如何通俗理解设计模式及其思想](https://blog.csdn.net/mq2553299/article/details/80962335)
7. [设计模式总结之模式分类](https://blog.csdn.net/cooldragon/article/details/52164380)
8. [浅谈常见设计模式](https://blog.51cto.com/12104971/2169591)
9. [GitHub-图说设计模式](https://github.com/me115/design_patterns)
10. [GitHub-Design Patterns](https://github.com/OmarElGabry/DesignPatterns)
11. [GitHub-java_design_patterns](https://github.com/JamesZBL/java_design_patterns)
12. [GitHub-Head-First-Design-Patterns](https://github.com/bethrobson/Head-First-Design-Patterns)
13. [GitHub-java-design-patterns](https://github.com/iluwatar/java-design-patterns)
14. [GitHub-awesome-design-patterns](https://github.com/DovAmir/awesome-design-patterns)