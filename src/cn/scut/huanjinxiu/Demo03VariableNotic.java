package cn.scut.huanjinxiu;
/*使用变量的时候，有一些注意事项：
1、如果创建多个变量，那么变量之间的名称不可以重复
2、对于long和float类型来说，字母后缀L和F不要丢掉
3、如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围
4、变量一定要先赋值才能使用
5、变量使用不能超过作用域的范围
【作用域】从定义变量的一行开始，一直到直接所属的大括号结束为止。
*/
public class Demo03VariableNotic {
    public static void main(String[] args) {
        int num1=10;
        //int num1=20;
int num2;
num2=10;
int num3;
        System.out.println(num2);
        //System.out.println(num4);
        int num4=300;
        System.out.println(num4);
        {int num5=82;
            System.out.println(num5);}
            //int num5;
        //System.out.println(num5);已经超出了大括号的范围，超出了作用域，变量不能再使用了
       // int a=1;
       // int b=2;
        //int c=3;
        //用逗号进行分隔，同时创建了3个都是int类型的变量
        int a,b,c;
        //各自分别赋值
        a=1;
        b=2;
        c=3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //同时创建3个int变量，并且同时各自赋值
        int x=10,y=20,z=30;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
