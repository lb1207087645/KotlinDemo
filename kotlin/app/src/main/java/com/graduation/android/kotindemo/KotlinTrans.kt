package com.graduation.android.kotindemo


/**
 * Kotlin 类型转化
 */
class KotlinTrans {

    fun main(args: Array<String>) {
        var m = 20
        val n: Byte = 10
        m = n.toInt()//byte 转化成int

        val x: Long = 20

        val value: Short = 20
        m = value.toInt()//short 转化成int


    }


}