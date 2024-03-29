package dev.dmohindru.ch2;

import java.lang.annotation.Repeatable;

@Repeatable(Risks.class)
public @interface Risk {
    String danger();
    int level() default 1;
}
