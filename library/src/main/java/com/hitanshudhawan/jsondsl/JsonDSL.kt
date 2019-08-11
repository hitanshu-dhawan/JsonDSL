package com.hitanshudhawan.jsondsl

import org.json.JSONArray
import org.json.JSONObject

fun json(block: JSONObjectBuilder.() -> Unit) = JSONObjectBuilder().apply(block).json

class JSONObjectBuilder {
    val json = JSONObject()

    infix fun String.to(value: Any?) {
        json.put(this, value ?: JSONObject.NULL)
    }
}

fun jsonArray(vararg values: Any?): JSONArray {
    val jsonArray = JSONArray()
    for (value in values)
        jsonArray.put(value ?: JSONObject.NULL)
    return jsonArray
}