package org.cj.context.support;

import org.cj.beans.factory.config.CJBeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CJDefaultListAbleBeanFactory {
    private final Map<String, CJBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);
}
