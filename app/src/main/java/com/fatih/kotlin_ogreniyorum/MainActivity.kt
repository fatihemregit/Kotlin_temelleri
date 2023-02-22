package com.fatih.kotlin_ogreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //codes
        println("Merhaba Kotlin")

        //Değişkenler
        println("----------Değişkenler----------")
        var x = 5
        var y = 4
        println(x * y)
        var yas = 20
        println((yas / 7) *5)
        yas = 21
        println(yas)
        //Sabitler
        println("----------Sabitler----------")
        val name = "Fatih"
        val nu = 5
        //integer
        println("----------İnteger----------")
        var age = 22
        val result = age /7 * 5
        println(result)
        var myInteger: Int//Defining
        myInteger = 10 //Initalize
        val a:Int = 5
        // kesirli sayılar(float,double)
        println("----------Double & Float----------")
        val pi = 3.14 //double
        println(pi * 2.0)
        val myFloat = 3.14f
        println(myFloat * 2)
        var myAge:Double
        myAge = 23.0
        println(myAge / 2)
        //Long
        println("----------Long----------")
        var myLong:Long = 5
        //String
        println("----------String----------")
        val myString = " Fatih Emre "
        val nname= "James"
        val surname = "Hetfield"
        val fullname = nname + " " + surname
        println(fullname)
        val larsName:String = "Lars"
        myString.capitalize()
        //Boolean
        println("----------Boolean----------")
        var myBoolean:Boolean = true
        myBoolean = false
        var isAlive = true
        //operatör işaretleri
        // < küçüktür
        // > büyüktür
        //<= küçük eşittir
        // >= büyük eşittir
        // == eşittir
        // != eşit değildir
        // && Ve
        // || veya
        println( 3 < 5 )
        println( 6 < 3 )
        println(3 == 3)
        println(4 != 5)
        //Birbirine çevirme(Conversion)
        println("----------Conversion----------")
        val myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)
        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)
        //Collections
        println("----------Collections----------")
        //Arrays
        println("----------Arrays----------")
        val myArray = arrayOf("James","Kirk","Rob","Lars")
        //index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])
        myArray.set(1,"Kirk Hamett")
        println(myArray[1])
        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])
        println(numberArray[5])
        val myNewArray = doubleArrayOf(1.0,2.0,3.0)
        val mixedArray = arrayOf("Fatih",5)
        println(mixedArray[0])
        println(mixedArray[1])
        //List- ArrayList
        println("---------- List ----------")
        val myMusician = arrayListOf<String>("james","Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])
        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)
        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Fatih")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)
        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])
        //Set
        println("---------- Set ----------")
        val myExampleArray = arrayOf(1,1,2,3,4)
        println("element 1 : ${myExampleArray[0]}")
        println("element 2 : ${myExampleArray[0]}")
        var myset = setOf<Int>(1,1,2,3)
        println(myset.size)
        //For each
        myset.forEach { println(it * 3 ) }
        val myStringSet = HashSet<String>()
        myStringSet.add("Fatih")
        myStringSet.add("Fatih")
        println(myStringSet.size)
        //Map - HashMap
        println("---------- Map ----------")
        val fruitArray = arrayOf("Apple","Banana")
        val caloriesArray = arrayOf(100,150)
        println(" ${fruitArray[0]} : ${caloriesArray[0]}")
        var fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])
        val myHashMap = HashMap<String,String>()
        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2)
        println(myNewMap["C"])
        //operator
        println("---------- Operator ----------")
        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7
        println(n > m)

        println(10 + 2)
        println(10 * 2)
        println(10 / 2)
        //Remainder
        println(10 % 2)
        // If Control
        println("---------- If Control----------")
        val myNumberAge = 32
        if( myNumberAge < 30) {
            println(" < 30 ")
        } else if (myNumberAge >= 30 && myNumberAge < 40) {
            println("30 -40 ")
        }else if (myNumberAge >= 40 && myNumberAge < 50){
            println("40 - 50")
        } else {
            println(">=50")
        }
        //Switch - When
        println("---------- Switch ----------")
        val day = 3
        var dayString = ""
        when(day){

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        //Loops
        // for loop
        println("---------- Loops ----------")
        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        // (0.eleman :3)*5 değişkene ata ve yazdır
        var sonuc = (myArrayOfNumbers[0] /3) * 5
        println(sonuc)
        for (num in myArrayOfNumbers){
            val z = num / 3 * 5
            println(z)
        }
        for (i in myArrayOfNumbers.indices){
            val qz = myArrayOfNumbers[i] / 3 * 5
            println(qz)
        }
        for (b in 0..9){
            println(b)
        }
        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Fatih")
        myStringArrayList.add("KILINÇ")
        myStringArrayList.add("Bar")

        for(str in myStringArrayList){
            println(str)
        }
        //While Loop
        var j = 0
        while (j < 10){
            println(j)
            j = j + 1
        }


    }
}