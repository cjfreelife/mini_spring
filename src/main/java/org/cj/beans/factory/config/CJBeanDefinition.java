package org.cj.beans.factory.config;

import lombok.Data;

@Data
public class CJBeanDefinition {
    private String beanClassName;
    private boolean lazyInit = false;
}
