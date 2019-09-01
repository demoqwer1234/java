package cn.itcast.day05.demo03Exception;

public class RegisterException extends RuntimeException{         //可以继承Exception 或者 RuntimeException

    public  RegisterException (){
        super();
    }

    public RegisterException(String message){
        super(message);
    }

}
