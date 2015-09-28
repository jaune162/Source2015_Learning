package com.codestd.springstudy.spel;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spel/applicationContext.xml"})
public class ExpressionParserTest {
	
	ExpressionParser parser = new SpelExpressionParser();
	
	@Test
	public void test() {
		//DefaultConversionService.addDefaultConverters(converterRegistry);
		//ConversionService
		Expression exp = parser.parseExpression("'"+(new Date()).getTime()+"'");
		Object value = exp.getValue(Date.class);
		System.out.println(value);
		System.out.println(value.getClass());
	}
	
	@Test
	public void testVariables(){
		Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
		//设置上下文
		StandardEvaluationContext context = new StandardEvaluationContext(tesla);
		context.setVariable("newName", "Mike Tesla");
		parser.parseExpression("Name = #newName").getValue(context);

		System.out.println(tesla.getName());
	}

}
