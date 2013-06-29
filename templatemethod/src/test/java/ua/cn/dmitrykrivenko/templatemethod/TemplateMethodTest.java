package ua.cn.dmitrykrivenko.templatemethod;

import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class TemplateMethodTest {

    @Test
    public void testTemplateMethod() {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.setCondiments(true);
        coffee.prepareRecipe();
    }
}
