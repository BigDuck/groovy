/*
 * Copyright (c) 2015 - 11 - 19  9 : 57 :6
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package w.p.j

/**
 * Created by WPJ587 on 2015/11/19.
 */
class Hello {
    static void main(args) {
        println("hello world")
        println "Hello World"
        def a = 13.plus(5);
        print(a)
        println("循环")
        repeat("helloworld");
        def range = 1..10
        println range.class;
        assert range instanceof List
        def coll = ["Groovy", "你好你好", "很好"]
        coll.add("傲视")
        //Groovy 支持操作符重载 —<< 操作符被重载，以支持向集合添加项。
        coll << "什么"
        coll[7] = "至死不渝"
        println(coll)
        /**
         * 集合减少
         */
        def number = [1, 2, 3, 4, 5]
        println("TestOne"+number)
        number+=[6]
        println("TestTwo"+number)
        number=number-[1,6]
        println("TestThre"+number)
        /**
         * 魔法方法
         * Groovy 还为集合添加了其他一些方便的功能。
         * 例如，可以在集合实例上调用特殊的方法，如下所示：
         */
        println(number.count(0))
        def numbers = [1,2,3,4]
        println numbers.join("-")
        println numbers.count(3)
        /**
         * HashMap
         */
        def hash=["name":"曾有一人","address":"福州市",0:"你妹"]
//           hash.put("age":19)
        println(hash["name"])
        println(hash["age"])
        println(hash.get("name"))
        def test=["age":415]
        test.put("test",15)

        println(test)
        println   test.get("test")
        println("---------------------------")
        test.sixGod=6
        println(test.sixGod)
        for(Iterator iter = coll.iterator(); iter.hasNext();){
            println iter.next()
        }
        def acoll = ["Groovy", "Java", "Ruby"]

        acoll.each{
            println it
        }
        hash.each{ key, value ->
            println "${key} : ${value}"
        }
        println("-----------")
        hash.each { key,value ->
            println "${key}:${value}"
        }

    }

    static void repeat(val) {
        for (int i = 0; i < 5; i++) {
            println(val)
        }
    }
}
