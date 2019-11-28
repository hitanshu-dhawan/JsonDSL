# JsonDSL
JsonDSL is a DSL in Kotlin for creating your JSON in a more easy and readable way.

## Usage
Create a `JSONObject` like this
```kotlin
json {
    "name" to "Hitanshu"
    "age"  to 22
    "male" to true
}
```
Create a nested object like this
```kotlin
json {
    "name" to "Hitanshu"
    "age"  to 22
    "male" to true
    "address" to json {
        "line1" to "Flat No. 100"
        "line2" to "Triveni Apartments"
        "city"  to "New Delhi"
    }
}
```
Create a `JSONArray` like this
```kotlin
jsonArray(
    json {
        "name" to "Hitanshu"
        "age"  to 22
        "male" to true
    },
    json {
        "name" to "Dhawan"
        "age"  to 23
        "male" to false
    }
)
```
Create a more nested object like this
```kotlin
json {
    "name" to "Hitanshu"
    "age"  to 22
    "male" to true
    "phones" to jsonArray(
        "+91 9999999999",
        "+91 8888888888"
    )
    "addresses" to jsonArray(
        json {
            "line1" to "Flat No. 100"
            "line2" to "Triveni Apartments"
            "city"  to "New Delhi"
        },
        json {
            "line1" to "Ispat Bhavan"
            "line2" to "Lodhi Road"
            "city"  to "New Delhi"
        }
    )
}
```

## Download
Add JitPack repository to your root `build.gradle` file
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency to your app `build.gradle` file
```
dependencies {
    implementation 'com.github.hitanshu-dhawan:JsonDSL:1.0.3'
}
```

## Licence
```
Copyright (c) 2019 Hitanshu Dhawan

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
