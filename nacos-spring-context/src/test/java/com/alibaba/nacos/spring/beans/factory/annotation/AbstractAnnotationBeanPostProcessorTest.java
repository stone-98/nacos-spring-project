/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one or more
 *  * contributor license agreements.  See the NOTICE file distributed with
 *  * this work for additional information regarding copyright ownership.
 *  * The ASF licenses this file to You under the Apache License, Version 2.0
 *  * (the "License"); you may not use this file except in compliance with
 *  * the License.  You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.alibaba.nacos.spring.beans.factory.annotation;

import org.junit.Assert;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

/**
 * {@link AbstractAnnotationBeanPostProcessor} Test
 * @author SuperZ1999
 * @date 2023/9/28
 */
public class AbstractAnnotationBeanPostProcessorTest {
    @Test
    public void testPropertyDescriptor() throws IntrospectionException {
        PropertyDescriptor pd = new PropertyDescriptor("name", Student.class);
        Class<?> type = pd.getPropertyType();
        Assert.assertEquals(type, String.class);
    }

    static class Student {
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}