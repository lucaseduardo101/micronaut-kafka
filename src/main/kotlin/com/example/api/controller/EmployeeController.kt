package com.example.api.controller

import com.example.domain.service.EmployeeSender
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/employee")
class EmployeeController (private val employeeSender: EmployeeSender) {

    @Get("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getEmployeeById(id:String): String {
        employeeSender.send(id)
        return "Retorna funcionario de Id: $id"
    }
}