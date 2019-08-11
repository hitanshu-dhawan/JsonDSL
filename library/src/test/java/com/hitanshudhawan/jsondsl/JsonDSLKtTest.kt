package com.hitanshudhawan.jsondsl

import org.json.JSONArray
import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Test

class JsonDSLKtTest {

    @Test
    fun test1() {
        assertEquals(
            json {
                //
            }.toString(),
            JSONObject().apply {
                //
            }.toString()
        )
    }

    @Test
    fun test2() {
        assertEquals(
            jsonArray(
                //
            ).toString(),
            JSONArray().apply {
                //
            }.toString()
        )
    }

    @Test
    fun test3() {
        assertEquals(
            json {
                "name" to "Hitanshu"
                "age" to 22
                "male" to true
            }.toString(),
            JSONObject().apply {
                put("name", "Hitanshu")
                put("age", 22)
                put("male", true)
            }.toString()
        )
    }

    @Test
    fun test4() {
        assertEquals(
            json {
                "string" to "String"
                "boolean" to false
                "int" to 7
                "float" to 7.7F
                "double" to 7.777
                "long" to 7777777777777777777L
            }.toString(),
            JSONObject().apply {
                put("string", "String")
                put("boolean", false)
                put("int", 7)
                put("float", 7.7F)
                put("double", 7.777)
                put("long", 7777777777777777777L)
            }.toString()
        )
    }

    @Test
    fun test5() {
        assertEquals(
            jsonArray(
                "one",
                "two",
                "three"
            ).toString(),
            JSONArray().apply {
                put("one")
                put("two")
                put("three")
            }.toString()
        )
    }

    @Test
    fun test6() {
        assertEquals(
            jsonArray(
                "String",
                false,
                7,
                7.7F,
                7.777,
                7777777777777777777L
            ).toString(),
            JSONArray().apply {
                put("String")
                put(false)
                put(7)
                put(7.7F)
                put(7.777)
                put(7777777777777777777L)
            }.toString()
        )
    }
}