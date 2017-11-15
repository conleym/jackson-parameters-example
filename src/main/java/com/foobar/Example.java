package com.foobar;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Example {
    private final int field1;
    private final int field2;

    @JsonCreator(mode= JsonCreator.Mode.PROPERTIES)
    public Example(final int field1, final int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
}
