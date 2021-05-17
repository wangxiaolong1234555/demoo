public class SexException extends Exception {
    public SexException(){

    }
    public SexException(String message){
        System.out.println(message);
        System.out.println("我是自定义的异常，知道是非男非女，但是1我也没法处理");
        System.out.println("……");
    }
}
