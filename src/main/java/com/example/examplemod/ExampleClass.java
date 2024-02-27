package com.example.examplemod;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ExampleClass(String someId) {

    public static final Codec<ExampleClass> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("someId").forGetter(ExampleClass::someId)
    ).apply(instance, ExampleClass::new));

}
