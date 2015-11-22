/*
 * Copyright (c) 2015 - 11 - 22  8 : 59 :39
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package w.p.j
/**
 * Created by WPJ587 on 2015/11/22.
 */
class Third {
    /**
     * Groovy入门经典
     * @param args
     */
    static main(args){
        def a=-123
        println(a+":"+a.class)
        def b=0.12f
        println(b+":"+b.class)
        def c=10.0e4
        println(c+":"+c.class)
        def d=10E4
        println(d+":"+d.class)
        def e="wupeji"
        println(e)
        //
        println(e.center(10,"@@@"))
        def f=[1,2,3,4,5,6,5]
        println(f.reverse())
        println(f.indexOf(5))
       printf('My name is wpj %d',4)
      //  input();
        println("排序后：")
        println(f.sort())
        bibao();
    }
    /**
     * 输入
     */
    static input(){
        print("输入你的名字：")

//        println("你的名字是：${name}")

    }
    /**
     * 闭包求阶
     * @return
     */
    static bibao(){
        def factoril=1
        1.upto(5){num->factoril*=num}
        println("5的阶层是:${factoril}")
      def num=[1,23,46,36,232,2,]
        println("--------------------------")
       def a= num.find {
          nums->nums>20
      }
       def list= num.collect {element->return element*element}
        println("list:${list}")
        def list1=num.collect{ele->ele*ele}
        println("list1:${list1}")
        println(a)
        println("--------------------------")

    }

}
