package com.example.firsttodoapiapp.repository

import com.example.firsttodoapiapp.entity.Todo

interface TodoRepository {
    fun getAll(): List<Todo>
    fun get(id: String): Todo
    fun create(title: String): Todo
    fun update(id: String, title: String, done: Boolean): Todo
    fun delete(id: String)
}