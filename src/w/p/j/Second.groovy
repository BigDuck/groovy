/*
 * Copyright (c) 2015 - 11 - 21  5 : 46 :23
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package w.p.j

/**
 * Created by WPJ587 on 2015/11/21.
 *
 */
class Second {

    static void main(args) {
        biaodashi()
        yunsuanfu()
        zifuchuan()
        def str=methodStr()
        println(str)
       def str1=methodStr1()
        println("返回："+str1)
        liucheng()
    }

    /**
     * 表达式：
     * 整数除以整数得到的结果一定是一个浮点数，如果想要只取整数部分值，使用intdiv方法，如：
     13.intdiv(5)结果是2；求模运算中包含浮点数是非法的，会提示mod方法被错误地调用
     */
    def static void biaodashi() {
        print 15.intdiv(6)
    }
    /**
     * 运算符：

     （1）Groovy运算符都是对象某方法的重载
     */
    def static void yunsuanfu() {
        assert 5 + 3 == 5.plus(3)
        assert 5 - 8 == 5.minus(8)
        assert 5 * 5 == 5.multiply(5)
        assert 5 / 2 == 5.div(2)
        assert 5 % 2 == 5.mod(2)
    }
    /**
     * 变量申明：
     Groovy使用def来申明一个变量，变量命名规则：
     必须由字母和数字组成
     大小写敏感
     首字母必须是字母
     下划线允许出现在命名中，以字母看待
     不允许为关键字
     */
    /**
     * 字符串：
     * Groovy除了可以使用单引号(')和双引号(")来封装字符串外还支持三引号(""")
     * ，三引号表示字符串包含多行文本与ruby的here doc类似，如
     * 单引号中的字符串不能用内插，
     *

     *
     */
    def static zifuchuan() {
        println()
        def money = 200.5
        println "My salary is ${money}"
        println 'My salary is ${money}'//money不会被替换为200.5
        def str = "Myname is jwpj"
        /**
         *   * 通过字符索引获取子字符串，
         */
        str.each { world ->
            println "${world}"
        }
        //第一个到第三个不包含第三个
        println(str[1..<3])
        println(str[1, 4, 3, 7])
        /**
         * 字符串的基本方法
         */
        println("size=" + str.size())
        println("length=" + str.length())
        println("count e=" + str.count('e'))
        println("count j=" + str.count('j'))
        println("contain=" + str.contains('wpj'))
        println("leftShift=" + str.leftShift('M'))
        println("leftShift=" + str.leftShift('y'))
        /**
         * 同Java的String对象一样Groovy的字符串值不可改变
         */
        /**
         * 正则表达式
         */
        def str1 = "wpjlikeyou"
        def res = str1.matches('wpj')
        println(res)
        str1 = str1.replaceAll('y', '6')
        println(str1)
        println()
        def regex = ~'hello';//定义正则表达式， ~紧接则字符串双引号单引号都可以
        def matcher = ("hello world" =~ "hello");//创建一个Matcher对象，~紧跟在=后面
        println regex.class;//class java.util.regex.Pattern
        println regex;//hello, 等价于regex.toString;
        println matcher;//java.util.regex.Matcher[pattern=hello region=0,11 lastmatch=hello], matcher.toString()
        println matcher.find();//true
        println matcher.matches();//false
        if ("hello world" =~ regex) {
            println true;//会打印出true
        }
        if ("hello world" =~ "hello") {
            println true;//会打印出true
        }
        /**
         * 范围（range）：
         *     范围是表达特定序列值的一种简略方法，有时可以当特定序列的数组用。
         1..10     // 1到 10
         10..1     // 10, 9, 8, ...., 1
         1..<10  // 1, 2, 3, 4, ...., 9
         'A'..'D'   // A, B, C, D
         def start = 10
         def finish = 12
         start..finish + 1           //[10, 11, 12, 13]
         */
        print "hello word"
        println "hello word"
        printf 'hello %s', 'word\n'


        println "<--------over---------------->";
    }
/**
 * 方法居然不需要写返回值
 * 干
 */
    def static methodStr() {
        return "hello wold"
    }
    def static methodStr1(){
        "默认会被返回值，最后一句";
    }
    def static liucheng(){
        /**
         * 流程控制语句：
         */
        def hashM=[1:"name",2:"address",3:"眼泪"]
        for(item in hashM){
            println("元素是：${hashM}")
        }
    }
}