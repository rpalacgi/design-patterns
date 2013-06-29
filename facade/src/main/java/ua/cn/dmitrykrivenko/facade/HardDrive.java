package ua.cn.dmitrykrivenko.facade;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("Hd read bootsector " + lba + ", sector size "+size);
        return new byte[2];
    }
}
