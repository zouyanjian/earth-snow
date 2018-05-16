/*
 * Copyright (C) 2018 justlive1
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package vip.justlive.common.base.convert;


/**
 * 类型转换服务
 * 
 * @author wubo
 *
 */
public interface ConverterService {

  /**
   * 类型是否支持转换
   * 
   * @param source
   * @param target
   * @return
   */
  boolean canConverter(Class<?> source, Class<?> target);

  /**
   * 转换到指定类型
   * 
   * @param source
   * @param targetType
   * @return
   */
  <T> T convert(Object source, Class<T> targetType);
}
