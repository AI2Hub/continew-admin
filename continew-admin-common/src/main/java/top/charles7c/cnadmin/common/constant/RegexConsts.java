/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.charles7c.cnadmin.common.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import cn.hutool.core.lang.RegexPool;

/**
 * 正则相关常量
 *
 * @author Charles7c
 * @since 2023/1/10 20:06
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RegexConsts implements RegexPool {

    /**
     * 用户名正则（长度为 4 到 16 位，可以包含字母、数字，下划线，以字母开头）
     */
    public static final String USERNAME = "^[a-zA-Z][a-zA-Z0-9_]{3,15}$";

    /**
     * 密码正则（长度为 6 到 32 位，可以包含字母、数字、下划线，特殊字符，同时包含字母和数字）
     */
    public static final String PASSWORD = "^(?=.*\\d)(?=.*[a-z]).{6,32}$";

    /**
     * 通用编码正则（长度为 2 到 16 位，可以包含字母、数字，下划线，以字母开头）
     */
    public static final String GENERAL_CODE = "^[a-zA-Z][a-zA-Z0-9_]{1,15}$";

    /**
     * 通用名称正则（长度为 1 到 20 位，可以包含中文、字母、数字、下划线，短横线）
     */
    public static final String GENERAL_NAME = "^[\\u4e00-\\u9fa5a-zA-Z0-9_-]{1,20}$";
}