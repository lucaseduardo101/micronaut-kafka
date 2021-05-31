package com.example.kafka.producer

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface ProductEmployee {
    @Topic("employees")
    fun sendEmployee(@KafkaKey brand:String, name:String)
}