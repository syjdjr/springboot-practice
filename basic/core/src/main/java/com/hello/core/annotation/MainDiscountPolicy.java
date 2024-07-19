package com.hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy")
/*Qualifier 은 String 으로 지정하므로
 런타임에 정의 되기 때문에 이를 단순하게 하기 위해 직접 어노테이션을 조합하여 MainDiscountPolicy 어노테이션을 만듦.*/

public @interface MainDiscountPolicy {

}
