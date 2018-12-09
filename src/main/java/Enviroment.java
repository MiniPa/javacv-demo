/**
 * Enviroment:
 *
 * @version 0.0.1  @date: 2018-12-09
 * @author: <a href="mailto:chengjs_minipa@outlook.com">chengjs_minipa</a>,
 */
public class Enviroment {

    public static final String PATH_PROJECT = "D:\\projects_spring\\javacv-demo\\";

    public static void setOpencvDll() {
        System.load(Enviroment.PATH_PROJECT + "doc\\opencv_java340-x64.dll");
    }


}
