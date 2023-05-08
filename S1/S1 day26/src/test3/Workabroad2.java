package test3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Workabroad2 {
    //此为字节流的常规方法，文件为明文保存
    //另一个为Object写入的二进制流，非人读取
    static String path = "D:\\学习\\s1\\作业\\API\\day26_03.dat";
    public static void main(String[] args) {
        circulate();
    }

    public static void circulate() {
        int count = 0;
        int temp = 0;
        int vip = 0;
        double sumIs = 0;
        double sumOc = 0;
        double sumFu = 0;
        for (int i = 1; i <= 1000; i++) {
            String msg = "FirstName";
            String s = "LastName";
            int num = (int) (Math.random() * (3 + 1 - 1) + 1);
            switch (num) {
                case 1:
                    count++;
                    double a = (Math.random() * (5000) + 3001) * 10;
                    DecimalFormat df = new DecimalFormat("0.00");
                    String format2 = df.format(a);
                    double as = Double.parseDouble(format2);
                    sumIs += as;
                    msg = msg + i + " " + s + i + "\t" + "assistant" + "\t" + as;
                    File srcFile = new File(path);
                    BufferedWriter bw = null;
                    try {
                        FileWriter fw = new FileWriter(srcFile, true);
                        bw = new BufferedWriter(fw);

                        //3.写,保留原来的文件内容不被覆盖
                        bw.write(msg + "\n");

                        //4.刷新
                        bw.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } finally {
                        try {
                            bw.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    break;
                case 2:
                    temp++;
                    double sa = (Math.random() * (6000) + 5001) * 10;
                    DecimalFormat sdf = new DecimalFormat("0.00");
                    String format1 = sdf.format(sa);
                    double v = Double.parseDouble(format1);
                    sumOc += v;
                    msg = msg + i + " " + s + i + "\t" + "associate" + "\t" + v;
                    File file = new File(path);
                    BufferedWriter be = null;
                    try {
                        FileWriter fc = new FileWriter(file, true);
                        be = new BufferedWriter(fc);

                        //3.写,保留原来的文件内容不被覆盖
                        be.write(msg + "\n");

                        //4.刷新
                        be.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } finally {
                        try {
                            be.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    break;
                case 3:
                    vip++;
                    double sac = (Math.random() * (1300) + 6200) * 10;
                    DecimalFormat sdfc = new DecimalFormat("0.00");
                    String format = sdfc.format(sac);
                    double v1 = Double.parseDouble(format);
                    sumFu += v1;
                    msg = msg + i + " " + s + i + "\t" + "full" + "\t" + v1;
                    File vile = new File(path);
                    BufferedWriter bv = null;
                    try {
                        FileWriter fd = new FileWriter(vile, true);
                        bv = new BufferedWriter(fd);

                        //3.写,保留原来的文件内容不被覆盖
                        bv.write(msg + "\n");

                        //4.刷新
                        bv.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } finally {
                        try {
                            bv.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }
        }
        System.out.println("assistant(助理)的工资:"+sumIs+"\n"+"associate（副）的工资："+sumOc+"\n"+"full (正)的工资："+sumFu);
        System.out.println("assistant(助理)的平均工资:"+sumIs/count+"\nassociate（副）的平均工资："+sumOc/temp+"\nfull (正)的平均工资:"+sumFu/vip);
    }
}
