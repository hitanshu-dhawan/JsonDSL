package com.hitanshudhawan.jsondsl

import org.json.JSONArray
import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Test

class JsonDSLKtTest {

    @Test
    fun test01() {
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
    fun test02() {
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
    fun test03() {
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
    fun test04() {
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
    fun test05() {
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
    fun test06() {
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

    @Test
    fun test07() {
        assertEquals(
            json {
                "name" to "Hitanshu"
                "age" to 22
                "male" to true
                "addresses" to jsonArray(
                    json {
                        "line1" to "Flat No. 404, Tower 3, Sec 45"
                        "line2" to "Near Ram Mandir"
                        "city" to "Gurgaon"
                        "state" to "Haryana"
                        "pinCode" to 122003
                    },
                    json {
                        "line1" to "Flat No. 405, Tower 3, Sec 45"
                        "line2" to "Near Ram Mandir"
                        "city" to "Gurgaon"
                        "state" to "Haryana"
                        "pinCode" to 122003
                    },
                    json {
                        "line1" to "Flat No. 406, Tower 3, Sec 45"
                        "line2" to "Near Ram Mandir"
                        "city" to "Gurgaon"
                        "state" to "Haryana"
                        "pinCode" to 122003
                    }
                )
            }.toString(),
            JSONObject().apply {
                put("name", "Hitanshu")
                put("age", 22)
                put("male", true)
                put("addresses", JSONArray().apply {
                    put(JSONObject().apply {
                        put("line1", "Flat No. 404, Tower 3, Sec 45")
                        put("line2", "Near Ram Mandir")
                        put("city", "Gurgaon")
                        put("state", "Haryana")
                        put("pinCode", 122003)
                    })
                    put(JSONObject().apply {
                        put("line1", "Flat No. 405, Tower 3, Sec 45")
                        put("line2", "Near Ram Mandir")
                        put("city", "Gurgaon")
                        put("state", "Haryana")
                        put("pinCode", 122003)
                    })
                    put(JSONObject().apply {
                        put("line1", "Flat No. 406, Tower 3, Sec 45")
                        put("line2", "Near Ram Mandir")
                        put("city", "Gurgaon")
                        put("state", "Haryana")
                        put("pinCode", 122003)
                    })
                })
            }.toString()
        )
    }

    @Test
    fun test08() {
        assertEquals(
            jsonArray(
                json {
                    "color" to "red"
                    "value" to "#f00"
                },
                json {
                    "color" to "green"
                    "value" to "#0f0"
                },
                json {
                    "color" to "blue"
                    "value" to "#00f"
                },
                json {
                    "color" to "cyan"
                    "value" to "#0ff"
                },
                json {
                    "color" to "magenta"
                    "value" to "#f0f"
                },
                json {
                    "color" to "yellow"
                    "value" to "#ff0"
                },
                json {
                    "color" to "black"
                    "value" to "#000"
                }
            ).toString(),
            JSONArray().apply {
                put(JSONObject().apply {
                    put("color", "red")
                    put("value", "#f00")
                })
                put(JSONObject().apply {
                    put("color", "green")
                    put("value", "#0f0")
                })
                put(JSONObject().apply {
                    put("color", "blue")
                    put("value", "#00f")
                })
                put(JSONObject().apply {
                    put("color", "cyan")
                    put("value", "#0ff")
                })
                put(JSONObject().apply {
                    put("color", "magenta")
                    put("value", "#f0f")
                })
                put(JSONObject().apply {
                    put("color", "yellow")
                    put("value", "#ff0")
                })
                put(JSONObject().apply {
                    put("color", "black")
                    put("value", "#000")
                })
            }.toString()
        )
    }

    @Test
    fun test09() {
        assertEquals(
            json {
                "id" to "0001"
                "type" to "donut"
                "name" to "Cake"
                "ppu" to 0.55
                "batters" to json {
                    "batter" to jsonArray(
                        json {
                            "id" to "1001"
                            "type" to "Regular"
                        },
                        json {
                            "id" to "1002"
                            "type" to "Chocolate"
                        },
                        json {
                            "id" to "1003"
                            "type" to "Blueberry"
                        },
                        json {
                            "id" to "1004"
                            "type" to "Devil's Food"
                        }
                    )
                }
                "topping" to jsonArray(
                    json {
                        "id" to "5001"
                        "type" to "None"
                    },
                    json {
                        "id" to "5002"
                        "type" to "Glazed"
                    },
                    json {
                        "id" to "5005"
                        "type" to "Sugar"
                    },
                    json {
                        "id" to "5007"
                        "type" to "Powdered Sugar"
                    },
                    json {
                        "id" to "5006"
                        "type" to "Chocolate with Sprinkles"
                    },
                    json {
                        "id" to "5003"
                        "type" to "Chocolate"
                    },
                    json {
                        "id" to "5004"
                        "type" to "Maple"
                    }
                )
            }.toString(),
            JSONObject().apply {
                put("id", "0001")
                put("type", "donut")
                put("name", "Cake")
                put("ppu", 0.55)
                put("batters", JSONObject().apply {
                    put("batter", JSONArray().apply {
                        put(JSONObject().apply {
                            put("id", "1001")
                            put("type", "Regular")
                        })
                        put(JSONObject().apply {
                            put("id", "1002")
                            put("type", "Chocolate")
                        })
                        put(JSONObject().apply {
                            put("id", "1003")
                            put("type", "Blueberry")
                        })
                        put(JSONObject().apply {
                            put("id", "1004")
                            put("type", "Devil's Food")
                        })
                    })
                })
                put("topping", JSONArray().apply {
                    put(JSONObject().apply {
                        put("id", "5001")
                        put("type", "None")
                    })
                    put(JSONObject().apply {
                        put("id", "5002")
                        put("type", "Glazed")
                    })
                    put(JSONObject().apply {
                        put("id", "5005")
                        put("type", "Sugar")
                    })
                    put(JSONObject().apply {
                        put("id", "5007")
                        put("type", "Powdered Sugar")
                    })
                    put(JSONObject().apply {
                        put("id", "5006")
                        put("type", "Chocolate with Sprinkles")
                    })
                    put(JSONObject().apply {
                        put("id", "5003")
                        put("type", "Chocolate")
                    })
                    put(JSONObject().apply {
                        put("id", "5004")
                        put("type", "Maple")
                    })
                })
            }.toString()
        )
    }

    @Test
    fun test10() {
        assertEquals(
            jsonArray(
                json {
                    "id" to "0001"
                    "type" to "donut"
                    "name" to "Cake"
                    "ppu" to 0.55
                    "batters" to json {
                        "batter" to jsonArray(
                            json {
                                "id" to "1001"
                                "type" to "Regular"
                            },
                            json {
                                "id" to "1002"
                                "type" to "Chocolate"
                            },
                            json {
                                "id" to "1003"
                                "type" to "Blueberry"
                            },
                            json {
                                "id" to "1004"
                                "type" to "Devil's Food"
                            }
                        )
                    }
                    "topping" to jsonArray(
                        json {
                            "id" to "5001"
                            "type" to "None"
                        },
                        json {
                            "id" to "5002"
                            "type" to "Glazed"
                        },
                        json {
                            "id" to "5005"
                            "type" to "Sugar"
                        },
                        json {
                            "id" to "5007"
                            "type" to "Powdered Sugar"
                        },
                        json {
                            "id" to "5006"
                            "type" to "Chocolate with Sprinkles"
                        },
                        json {
                            "id" to "5003"
                            "type" to "Chocolate"
                        },
                        json {
                            "id" to "5004"
                            "type" to "Maple"
                        }
                    )
                },
                json {
                    "id" to "0002"
                    "type" to "donut"
                    "name" to "Raised"
                    "ppu" to 0.55
                    "batters" to json {
                        "batter" to jsonArray(
                            json {
                                "id" to "1001"
                                "type" to "Regular"
                            }
                        )
                    }
                    "topping" to jsonArray(
                        json {
                            "id" to "5001"
                            "type" to "None"
                        },
                        json {
                            "id" to "5002"
                            "type" to "Glazed"
                        },
                        json {
                            "id" to "5005"
                            "type" to "Sugar"
                        },
                        json {
                            "id" to "5003"
                            "type" to "Chocolate"
                        },
                        json {
                            "id" to "5004"
                            "type" to "Maple"
                        }
                    )
                },
                json {
                    "id" to "0003"
                    "type" to "donut"
                    "name" to "Old Fashioned"
                    "ppu" to 0.55
                    "batters" to json {
                        "batter" to jsonArray(
                            json {
                                "id" to "1001"
                                "type" to "Regular"
                            },
                            json {
                                "id" to "1002"
                                "type" to "Chocolate"
                            }
                        )
                    }
                    "topping" to jsonArray(
                        json {
                            "id" to "5001"
                            "type" to "None"
                        },
                        json {
                            "id" to "5002"
                            "type" to "Glazed"
                        },
                        json {
                            "id" to "5003"
                            "type" to "Chocolate"
                        },
                        json {
                            "id" to "5004"
                            "type" to "Maple"
                        }
                    )
                }
            ).toString(),
            JSONArray().apply {
                put(JSONObject().apply {
                    put("id", "0001")
                    put("type", "donut")
                    put("name", "Cake")
                    put("ppu", 0.55)
                    put("batters", JSONObject().apply {
                        put("batter", JSONArray().apply {
                            put(JSONObject().apply {
                                put("id", "1001")
                                put("type", "Regular")
                            })
                            put(JSONObject().apply {
                                put("id", "1002")
                                put("type", "Chocolate")
                            })
                            put(JSONObject().apply {
                                put("id", "1003")
                                put("type", "Blueberry")
                            })
                            put(JSONObject().apply {
                                put("id", "1004")
                                put("type", "Devil's Food")
                            })
                        })
                    })
                    put("topping", JSONArray().apply {
                        put(JSONObject().apply {
                            put("id", "5001")
                            put("type", "None")
                        })
                        put(JSONObject().apply {
                            put("id", "5002")
                            put("type", "Glazed")
                        })
                        put(JSONObject().apply {
                            put("id", "5005")
                            put("type", "Sugar")
                        })
                        put(JSONObject().apply {
                            put("id", "5007")
                            put("type", "Powdered Sugar")
                        })
                        put(JSONObject().apply {
                            put("id", "5006")
                            put("type", "Chocolate with Sprinkles")
                        })
                        put(JSONObject().apply {
                            put("id", "5003")
                            put("type", "Chocolate")
                        })
                        put(JSONObject().apply {
                            put("id", "5004")
                            put("type", "Maple")
                        })
                    })
                })
                put(JSONObject().apply {
                    put("id", "0002")
                    put("type", "donut")
                    put("name", "Raised")
                    put("ppu", 0.55)
                    put("batters", JSONObject().apply {
                        put("batter", JSONArray().apply {
                            put(JSONObject().apply {
                                put("id", "1001")
                                put("type", "Regular")
                            })
                        })
                    })
                    put("topping", JSONArray().apply {
                        put(JSONObject().apply {
                            put("id", "5001")
                            put("type", "None")
                        })
                        put(JSONObject().apply {
                            put("id", "5002")
                            put("type", "Glazed")
                        })
                        put(JSONObject().apply {
                            put("id", "5005")
                            put("type", "Sugar")
                        })
                        put(JSONObject().apply {
                            put("id", "5003")
                            put("type", "Chocolate")
                        })
                        put(JSONObject().apply {
                            put("id", "5004")
                            put("type", "Maple")
                        })
                    })
                })
                put(JSONObject().apply {
                    put("id", "0003")
                    put("type", "donut")
                    put("name", "Old Fashioned")
                    put("ppu", 0.55)
                    put("batters", JSONObject().apply {
                        put("batter", JSONArray().apply {
                            put(JSONObject().apply {
                                put("id", "1001")
                                put("type", "Regular")
                            })
                            put(JSONObject().apply {
                                put("id", "1002")
                                put("type", "Chocolate")
                            })
                        })
                    })
                    put("topping", JSONArray().apply {
                        put(JSONObject().apply {
                            put("id", "5001")
                            put("type", "None")
                        })
                        put(JSONObject().apply {
                            put("id", "5002")
                            put("type", "Glazed")
                        })
                        put(JSONObject().apply {
                            put("id", "5003")
                            put("type", "Chocolate")
                        })
                        put(JSONObject().apply {
                            put("id", "5004")
                            put("type", "Maple")
                        })
                    })
                })
            }.toString()
        )
    }

    @Test
    fun test11() {
        assertEquals(
            json {
                "key" to null
            }.toString(),
            JSONObject().apply {
                put("key", JSONObject.NULL)
            }.toString()
        )
    }

    @Test
    fun test12() {
        assertEquals(
            jsonArray(
                null,
                null,
                null
            ).toString(),
            JSONArray().apply {
                put(JSONObject.NULL)
                put(JSONObject.NULL)
                put(JSONObject.NULL)
            }.toString()
        )
    }

    @Test(expected = IllegalArgumentException::class)
    fun test13() {
        json {
            "key" to 'j'
        }
    }

    @Test(expected = IllegalArgumentException::class)
    fun test14() {
        json {
            "key" to Pair("j", "j")
        }
    }

    @Test(expected = IllegalArgumentException::class)
    fun test15() {
        jsonArray("j", 'j', "j")
    }

    @Test(expected = IllegalArgumentException::class)
    fun test16() {
        jsonArray("j", Pair("j", "j"), "j")
    }

}