package com.example.test

data class Student(val name: String, val course: String) {
    override fun toString(): String {
        return "$name $course"
    }
}
