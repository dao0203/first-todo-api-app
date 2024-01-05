package com.example.firsttodoapiapp.repository

import com.example.firsttodoapiapp.entity.Todo
import javax.inject.Inject


class TodoRepositoryImpl @Inject constructor() : TodoRepository {
    override fun getAll(): List<Todo> {
        TODO("Not yet implemented")
    }

    override fun get(id: String): Todo {
        TODO("Not yet implemented")
    }

    override fun create(title: String): Todo {
        TODO("Not yet implemented")
    }

    override fun update(id: String, title: String, done: Boolean): Todo {
        TODO("Not yet implemented")
    }

    override fun delete(id: String) {
        TODO("Not yet implemented")
    }
}
