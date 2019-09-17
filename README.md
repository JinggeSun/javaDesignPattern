# javaDesignPattern
Java的设计模式

### 起因
在平时工作中，或者说在curd中，大都是mvc，很少用到其他的设计模式。但是，理解设计模式对于一个想要到达中级工程师来说，是必经之路。
### 思路
有点困惑，很多场景，如果不用设计模式，也可以顺利完成。那为什么还要使用它呢？
1. 理解为什么要这样设计
2. 这种模式适合什么样的场景
3. 学习出处[设计模式](http://www.runoob.com/design-pattern/design-pattern-tutorial.html)

## 单例模式 Singleton Pattern
1. 单例类只能有一个实例。
2. 单例类必须自己创建自己的唯一实例。
3. 单例类必须给所有其他对象提供这一实例。
4. 主要解决：一个全局使用的类频繁地创建与销毁。
5. 何时使用：当您想控制实例数目，节省系统资源的时候。
6. 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
7. 关键代码：构造函数是私有的。
8. 饿汉 初始化加载 线程安全
9. 懒汉 使用加载 线程不安全 加锁
