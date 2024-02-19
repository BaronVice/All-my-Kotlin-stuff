@file:JvmName("Casts")
package casts

fun stringToUpper(s: Any) :String? = if (s is String){s.uppercase()} else null

fun betterStringToUpper(s: Any?) :String? = (s as? String)?.uppercase()
