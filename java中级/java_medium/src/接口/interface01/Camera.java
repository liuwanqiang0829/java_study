package 接口.interface01;

public class Camera implements USBInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作了");
    }

    @Override
    public void end() {
        System.out.println("相机停止工作了");
    }
}
