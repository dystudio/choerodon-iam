package io.choerodon.iam.app.service;

import java.util.List;
import java.util.Set;

import org.hzero.iam.domain.entity.Permission;

/**
 * @author scp
 * @date 2020/4/1
 * @description
 */
public interface PermissionC7nService {

    Set<Permission> queryByRoleIds(List<Long> roleIds);

}
