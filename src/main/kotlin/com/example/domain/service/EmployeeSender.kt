package com.example.domain.service

import com.example.kafka.producer.ProducerEmployee
import java.util.*
import javax.inject.Singleton

@Singleton
class EmployeeSender (val producerEmployee: ProducerEmployee) {

    fun send(id:String){
        return producerEmployee.sendEmployee(UUID.randomUUID().toString(), id)
    }
}