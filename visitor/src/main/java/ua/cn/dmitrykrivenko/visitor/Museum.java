package ua.cn.dmitrykrivenko.visitor;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Museum implements Element {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Museum is accepting visitor.");
        visitor.visit(this);
    }
}
