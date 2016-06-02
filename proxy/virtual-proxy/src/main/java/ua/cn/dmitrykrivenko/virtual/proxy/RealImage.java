package ua.cn.dmitrykrivenko.virtual.proxy;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class RealImage implements Image {

    private final String filename;

    public RealImage(final String fileName) {
        filename = fileName;
    }

	@Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
