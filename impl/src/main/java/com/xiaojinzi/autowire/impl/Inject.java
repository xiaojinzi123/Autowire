package com.xiaojinzi.autowire.impl;

import androidx.annotation.NonNull;

import com.xiaojinzi.autowire.ComponentConstants;
import com.xiaojinzi.autowire.IInject;

import java.util.Objects;

public class Inject {

    /**
     * 找到实现类,执行注入
     *
     * @param target
     */
    public static void inject(@NonNull Object target) {
        Objects.requireNonNull(target);
        String injectClassName = target.getClass().getName() + ComponentConstants.INJECT_SUFFIX;
        try {
            Class<?> targetInjectClass = Class.forName(injectClassName);
            IInject inject = (IInject) targetInjectClass.newInstance();
            inject.inject(target);
        } catch (Exception ignore) {
            // LogUtil.log(target.getClass().getName(), "field inject fail");
        }
    }

}
