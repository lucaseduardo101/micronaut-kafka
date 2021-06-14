package com.example.kafka.consumer

import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.OffsetReset
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
class ConsumerEmployee {
    @Topic("employees")
    fun receive(@KafkaKey brand:String, codigo:String){
        System.out.println("Lendo employee de codigo: $codigo ")
    }
}