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

package top.charles7c.cnadmin.system.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import cn.hutool.core.lang.tree.Tree;

import top.charles7c.cnadmin.common.base.BaseService;
import top.charles7c.cnadmin.system.model.query.DeptQuery;
import top.charles7c.cnadmin.system.model.request.DeptRequest;
import top.charles7c.cnadmin.system.model.vo.DeptDetailVO;
import top.charles7c.cnadmin.system.model.vo.DeptVO;

/**
 * 部门业务接口
 *
 * @author Charles7c
 * @since 2023/1/22 17:54
 */
public interface DeptService extends BaseService<DeptVO, DeptDetailVO, DeptQuery, DeptRequest> {

    /**
     * 构建树
     *
     * @param list
     *            原始列表数据
     * @return 树列表
     */
    List<DeptVO> buildListTree(List<DeptVO> list);

    /**
     * 构建树
     *
     * @param list
     *            原始列表数据
     * @return 树列表
     */
    List<Tree<Long>> buildTree(List<DeptVO> list);

    /**
     * 检查部门名称是否存在
     *
     * @param deptName
     *            部门名称
     * @param parentId
     *            上级部门 ID
     * @param deptId
     *            部门 ID
     * @return 是否存在
     */
    boolean checkDeptNameExist(String deptName, Long parentId, Long deptId);

    /**
     * 导出
     *
     * @param query
     *            查询条件
     * @param response
     *            响应对象
     */
    void export(DeptQuery query, HttpServletResponse response);
}
