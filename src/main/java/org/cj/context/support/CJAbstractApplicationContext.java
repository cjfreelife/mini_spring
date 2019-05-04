package org.cj.context.support;

import org.cj.context.CJConfigurableApplicationContext;

public abstract class CJAbstractApplicationContext implements CJConfigurableApplicationContext {

    public void refresh() {
        //定位
        //加载
        //注册
    }

    protected abstract void refreshBeanFactory();
}
