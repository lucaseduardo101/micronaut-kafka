package com.example.api.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/employee")
class EmployeeController {

    @Get("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getEmployeeById(id:String): String {
        return "Retorna funcionario de Id: $id"
    }
}