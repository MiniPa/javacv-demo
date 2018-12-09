import org.opencv.core.Mat;

import static org.bytedeco.javacpp.opencv_highgui.waitKey;
import static org.opencv.highgui.HighGui.imshow;
import static org.opencv.imgcodecs.Imgcodecs.imread;

/**
 * HiJavacv:
 *
 * 【bug】java.lang.UnsatisfiedLinkError: org.opencv.imgcodecs.Imgcodecs.imread_1(Ljava/lang/String;)J
 *  原因：windows上 opencv的dll文件未加载 System.load(JmxGenerate.COMMON_PATH + "opencv_java340-x64.dll");
 * 【src】https://docs.opencv.org/2.4/doc/tutorials/introduction/desktop_java/java_dev_intro.html
 *
 * @version 0.0.1  @date: 2018-12-09
 * @author: <a href="mailto:chengjs_minipa@outlook.com">chengjs_minipa</a>,
 */
public class HiJavacv {

    public static void main(String[] args) {
        Enviroment.setOpencvDll();

        Mat image = imread(Enviroment.PATH_PROJECT + "src\\main\\resources\\img\\bear.jpg");
        if (image.empty()) {
            System.out.println("加载图片出错，请检查图片位置");
            return;
        }
        System.out.println("加载图片成功，开始显示图片");

        imshow("显示原始图像", image);
        waitKey(0);
        /*未能显示图像，原因不清*/
    }


}
