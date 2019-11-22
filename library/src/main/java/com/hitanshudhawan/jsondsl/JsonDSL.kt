package com.hitanshudhawan.jsondsl

import org.json.JSONArray
import org.json.JSONObject

fun json(block: JSONObjectBuilder.() -> Unit) = JSONObjectBuilder().apply(block).json

class JSONObjectBuilder {
    val json = JSONObject()

    infix fun String.to(value: String?) {
        json.put(this, value ?: JSONObject.NULL)
    }

    infix fun String.to(value: Number?) {
        json.put(this, value ?: JSONObject.NULL)
    }

    infix fun String.to(value: Boolean?) {
        json.put(this, value ?: JSONObject.NULL)
    }

    infix fun String.to(value: JSONObject?) {
        json.put(this, value ?: JSONObject.NULL)
    }

    infix fun String.to(value: JSONArray?) {
        json.put(this, value ?: JSONObject.NULL)
    }
}

fun jsonArray(vararg values: Any?): JSONArray {
    val jsonArray = JSONArray()
    for (value in values) {
        if (value.isValidDataType())
            jsonArray.put(value ?: JSONObject.NULL)
        else
            throw IllegalArgumentException("$value is not a valid data type")
    }
    return jsonArray
}

private fun Any?.isValidDataType() = when (this) {
    is String?, is Number?, is Boolean?, is JSONObject?, is JSONArray? -> true
    else -> false
}
