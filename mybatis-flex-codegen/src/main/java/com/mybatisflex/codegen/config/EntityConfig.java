/**
 * Copyright (c) 2022-2023, Mybatis-Flex (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mybatisflex.codegen.config;

import java.io.Serializable;

/**
 * 生成 Entity 的配置。
 *
 * @author 王帅
 * @since 2023-05-15
 */
@SuppressWarnings("unused")
public class EntityConfig {

    /**
     * Entity 类的前缀。
     */
    private String classPrefix = "";

    /**
     * Entity 类的后缀。
     */
    private String classSuffix = "";

    /**
     * Entity 类的父类，可以自定义一些 BaseEntity 类。
     */
    private Class<?> supperClass;

    /**
     * Entity 默认实现的接口。
     */
    private Class<?>[] implInterfaces = {Serializable.class};

    /**
     * Entity 是否使用 Lombok 注解。
     */
    private boolean withLombok;

    public String getClassPrefix() {
        return classPrefix;
    }

    public EntityConfig setClassPrefix(String classPrefix) {
        this.classPrefix = classPrefix;
        return this;
    }

    public String getClassSuffix() {
        return classSuffix;
    }

    public EntityConfig setClassSuffix(String classSuffix) {
        this.classSuffix = classSuffix;
        return this;
    }

    public Class<?> getSupperClass() {
        return supperClass;
    }

    public EntityConfig setSupperClass(Class<?> supperClass) {
        this.supperClass = supperClass;
        return this;
    }

    public Class<?>[] getImplInterfaces() {
        return implInterfaces;
    }

    public EntityConfig setImplInterfaces(Class<?>[] implInterfaces) {
        this.implInterfaces = implInterfaces;
        return this;
    }

    public boolean isWithLombok() {
        return withLombok;
    }

    public EntityConfig setWithLombok(boolean withLombok) {
        this.withLombok = withLombok;
        return this;
    }

}