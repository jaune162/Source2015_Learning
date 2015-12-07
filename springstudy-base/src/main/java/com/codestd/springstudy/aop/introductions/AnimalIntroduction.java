package com.codestd.springstudy.aop.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnimalIntroduction {

	//@DeclareParents(value="com.codestd.springstudy.aop.introductions.*+", defaultImpl=DefaultFlyable.class)
	@DeclareParents(value="com.codestd.springstudy.aop.introductions.Animal+", defaultImpl=DefaultFlyable.class)
	public static Flyable flyable;
	
	
}
