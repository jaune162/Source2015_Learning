package com.codestd.springstudy.spel;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
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
	
	@Test
	public void testFunction() throws Exception{
		StandardEvaluationContext context = new StandardEvaluationContext();

		context.registerFunction("reverseString",
		    StringUtils.class.getDeclaredMethod("reverse", new Class[] { String.class }));
		String helloWorldReversed = parser.parseExpression(
		    "#reverseString('hello')").getValue(context, String.class);
		System.out.println(helloWorldReversed);
	}
	
	@Test
	public void testTemplate(){
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.setVariable("newName", "Mike Tesla");
		Expression exp = this.parser.parseExpression("I'm #{#newName}", new TemplateParserContext());
		//Expression exp = this.parser.parseExpression("#newName");
		String phraseStr = (String)exp.getValue(context);
		System.out.println(phraseStr);
	} 

}
