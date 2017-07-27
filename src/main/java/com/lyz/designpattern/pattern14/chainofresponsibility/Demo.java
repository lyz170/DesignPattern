package com.lyz.designpattern.pattern14.chainofresponsibility;

/**
 * 责任链模式<br>
 * 顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。<br>
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。<br>
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。<br>
 * 如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。<br>
 * 
 * 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，<br>
 * 将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。<br>
 * 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，<br>
 * 无须关心请求的处理细节和请求的传递， 所以职责链将请求的发送者和请求的处理者解耦了。<br>
 * 何时使用：在处理消息的时候以过滤很多道。 <br>
 * 如何解决：拦截的类都实现统一接口。<br>
 * 关键代码：Handler 里面聚合它自己，在 HanleRequest 里判断是否合适，如果没达到条件则向下传递，向谁传递之前 set 进去。<br>
 */
public class Demo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(LoggerType.ERROR.getCode());
        AbstractLogger fileLogger = new FileLogger(LoggerType.DEBUG.getCode());
        AbstractLogger consoleLogger = new ConsoleLogger(LoggerType.INFO.getCode());

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(LoggerType.INFO.getCode(), "This is an information.");

        loggerChain.logMessage(LoggerType.DEBUG.getCode(), "This is an debug level information.");

        loggerChain.logMessage(LoggerType.ERROR.getCode(), "This is an error information.");
    }
}
