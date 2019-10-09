package com.xiaojinzi.autowire;

/**
 * 每一个生成的类都应该实现这个接口
 */
public interface IInject<T> {

    /**
     * 注入控件
     */
    void inject(T target);

}
