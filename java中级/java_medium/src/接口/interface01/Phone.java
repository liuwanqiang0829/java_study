package 接口.interface01;

public class Phone implements USBInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作了");
    }

    @Override
    public void end() {
        System.out.println("手机停止工作了");
    }
}
