package org.example.maven;

public class Hello
{
    /**
     * 注释测试
     *
     * @param name： 姓名
     * @return 输出
     */
    public String sayHello(String name)
    {
        return "Hello " + name + "!";
    }

    public static void main(String[] args)
    {
        System.out.println("Hello IDEA!");
        System.out.println("更新一！");
        System.out.println("创建分支dev!");
    }
}
